import numpy as np
import cv2
import imutils
from matplotlib import pyplot as plt

cap = cv2.VideoCapture(0)

# Check if the webcam is opened correctly
if not cap.isOpened():
    raise IOError("Cannot open webcam")

while True:
    ret, frame = cap.read()
    frame = cv2.resize(frame, None, fx=1, fy=1, interpolation=cv2.INTER_AREA)

    image = cv2.cvtColor(frame, cv2.COLOR_BGR2HSV)
    # cv2.imshow('image', image)

    # AMARELO
    lower = np.array([20, 100, 100], dtype="uint8")
    upper = np.array([30, 255, 255], dtype="uint8")

    mask = cv2.inRange(image, lower, upper)

    # cv2.imshow('mask', mask)

    blurred = cv2.medianBlur(mask, 25)
    cv2.imshow('blurred', blurred)

    # cv2.imshow('gray', imgray)

    circles = cv2.HoughCircles(blurred, cv2.HOUGH_GRADIENT, 3, 10, param1=250, param2=90, minRadius=0, maxRadius=100)
    if(circles is not None):
        circles = np.round(circles[0, :]).astype('int')
    
        for (x, y, r) in circles:
            cv2.circle(frame,(x, y), r,(255, 0, 0), 4)
            print('Centro: [{}, {}]'.format(x, y))
    cv2.imshow('result', frame)

    c = cv2.waitKey(1)
    if c == 27:
        break

cap.release()
cv2.destroyAllWindows()