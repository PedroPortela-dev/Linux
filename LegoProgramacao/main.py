import math

#!/usr/bin/env pybricks-micropython
from pybricks.hubs import EV3Brick
from pybricks.ev3devices import (Motor, TouchSensor, ColorSensor,
                                 InfraredSensor, UltrasonicSensor, GyroSensor)
from pybricks.parameters import Port, Stop, Direction, Button, Color
from pybricks.tools import wait, StopWatch, DataLog
from pybricks.robotics import DriveBase
from pybricks.media.ev3dev import SoundFile, ImageFile

class rodas:
    def _init_(raio):
        global raio
    
    def dist(angulo):
        angulo*math.pi/180*raio 

class ponto:
    def _init_(x=0, y=0, dx=0, dy=0, d=0, a=0, ref=0):
        x += ref[0]
        y += ref[1]
        if dx>0 & dy>0:
            a += math.atan(dy/dx)
        elif dx<0 & dy>0:
            a += math.atan(dy/dx) + 180
        elif dx<0 & dy<0:
            a += math.atan(dy/dx) - 180
        elif dx>0 & dy<0:
            a += math.atan(dy/dx) 
        d += math.sqrt(math.pow(dx, 2)+math.pow(dy, 2))   
        
        
    def class:
        return [x+math.cos(a)*d, y+math.sen(a)*d]

class quadrado:
    def _init_(centro, )
# This program requires LEGO EV3 MicroPython v2.0 or higher.
# Click "Open user guide" on the EV3 extension tab for more information.

roda = ponto()
centroRobo = ponto(ref = roda, dx = 4.5, dy = -2.5, a  = gyro)

# Create your objects here.
ev3 = EV3Brick()

motorB = Motor(Port.B)
motorC = Motor(Port.C)

# Write your program here.
ev3.speaker.beep()

motorB.run_target(500, 90)

ev3.speaker.beep(frequency=1000, duration=500)
