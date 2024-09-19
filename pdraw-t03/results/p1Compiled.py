from graphics import *
import time, math, os, sys
sys.path.insert(0, os.path.abspath(os.path.join(os.path.dirname(__file__), '../src')))
from IPDrawInterpreter import run_interpreter
win = GraphWin('PDraw', 500, 500)

PenType1 = {'color': 'black', 'position': Point(0,0), 'orientation': 0, 'thickness': 1, 'pressure': 0}
PenType1['color'] = 'green'
PenType1['position'] = Point(10, 10)
PenType1['orientation'] = 45
PenType1['thickness'] = 10
PenType1['pressure'] = -1
p1 = PenType1
p1['pressure'] = 1
p1_position = p1['position']
angle_rad = math.radians(p1['orientation'])
dx = 10 * math.cos(angle_rad)
dy = 10 * math.sin(angle_rad)
if 'forward' == 'backward':
    dx = -dx
    dy = -dy
p1_new_position = Point(p1_position.getX() + dx, p1_position.getY() + dy)
if p1['pressure'] > 0:
    line = Line(p1_position, p1_new_position)
    line.setWidth(p1['thickness'])
    line.setFill(p1['color'])
    line.draw(win)
p1['position'] = p1_new_position
if 'left' == 'right':
    p1['orientation'] = (p1['orientation'] + 90) % 360
else:
    p1['orientation'] = (p1['orientation'] - 90) % 360
p1_position = p1['position']
angle_rad = math.radians(p1['orientation'])
dx = 10 * math.cos(angle_rad)
dy = 10 * math.sin(angle_rad)
if 'forward' == 'backward':
    dx = -dx
    dy = -dy
p1_new_position = Point(p1_position.getX() + dx, p1_position.getY() + dy)
if p1['pressure'] > 0:
    line = Line(p1_position, p1_new_position)
    line.setWidth(p1['thickness'])
    line.setFill(p1['color'])
    line.draw(win)
p1['position'] = p1_new_position
if 'left' == 'right':
    p1['orientation'] = (p1['orientation'] + 90) % 360
else:
    p1['orientation'] = (p1['orientation'] - 90) % 360
p1_position = p1['position']
angle_rad = math.radians(p1['orientation'])
dx = 10 * math.cos(angle_rad)
dy = 10 * math.sin(angle_rad)
if 'forward' == 'backward':
    dx = -dx
    dy = -dy
p1_new_position = Point(p1_position.getX() + dx, p1_position.getY() + dy)
if p1['pressure'] > 0:
    line = Line(p1_position, p1_new_position)
    line.setWidth(p1['thickness'])
    line.setFill(p1['color'])
    line.draw(win)
p1['position'] = p1_new_position
if 'left' == 'right':
    p1['orientation'] = (p1['orientation'] + 90) % 360
else:
    p1['orientation'] = (p1['orientation'] - 90) % 360
p1_position = p1['position']
angle_rad = math.radians(p1['orientation'])
dx = 10 * math.cos(angle_rad)
dy = 10 * math.sin(angle_rad)
if 'forward' == 'backward':
    dx = -dx
    dy = -dy
p1_new_position = Point(p1_position.getX() + dx, p1_position.getY() + dy)
if p1['pressure'] > 0:
    line = Line(p1_position, p1_new_position)
    line.setWidth(p1['thickness'])
    line.setFill(p1['color'])
    line.draw(win)
p1['position'] = p1_new_position
if 'left' == 'right':
    p1['orientation'] = (p1['orientation'] + 90) % 360
else:
    p1['orientation'] = (p1['orientation'] - 90) % 360
psec = {'color': 'black', 'position': Point(0,0), 'orientation': 0, 'thickness': 1, 'pressure': 0}
input_file = os.path.abspath(os.path.join(os.path.dirname(__file__), '../examples/' + 'p1.ipdraw'))
run_interpreter(psec, input_file, win)

win.getMouse() 
win.close()