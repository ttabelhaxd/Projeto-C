from graphics import *
import time, math, os, sys
sys.path.insert(0, os.path.abspath(os.path.join(os.path.dirname(__file__), '../src')))
from IPDrawInterpreter import run_interpreter
width = float(input("width: "))
height = float(input("height: "))
Canvas1 = GraphWin('Example p2', width, height)
PenType2 = {'color': 'black', 'position': Point(0,0), 'orientation': 0, 'thickness': 1, 'pressure': 0}
PenType2['color'] = 'blue'
PenType2['position'] = Point(int(width) // 2, int(height) // 2)
p2 = PenType2
print(p2)
print("\n")
time.sleep(0)
p2['pressure'] = 1
p2_position = p2['position']
angle_rad = math.radians(p2['orientation'])
dx = 10 * math.cos(angle_rad)
dy = 10 * math.sin(angle_rad)
if 'forward' == 'backward':
    dx = -dx
    dy = -dy
p2_new_position = Point(p2_position.getX() + dx, p2_position.getY() + dy)
if p2['pressure'] > 0:
    line = Line(p2_position, p2_new_position)
    line.setWidth(p2['thickness'])
    line.setFill(p2['color'])
    line.draw(Canvas1)
p2['position'] = p2_new_position
if 'right' == 'right':
    p2['orientation'] = (p2['orientation'] + 144) % 360
else:
    p2['orientation'] = (p2['orientation'] - 144) % 360
p2_position = p2['position']
angle_rad = math.radians(p2['orientation'])
dx = 10 * math.cos(angle_rad)
dy = 10 * math.sin(angle_rad)
if 'forward' == 'backward':
    dx = -dx
    dy = -dy
p2_new_position = Point(p2_position.getX() + dx, p2_position.getY() + dy)
if p2['pressure'] > 0:
    line = Line(p2_position, p2_new_position)
    line.setWidth(p2['thickness'])
    line.setFill(p2['color'])
    line.draw(Canvas1)
p2['position'] = p2_new_position
if 'right' == 'right':
    p2['orientation'] = (p2['orientation'] + 144) % 360
else:
    p2['orientation'] = (p2['orientation'] - 144) % 360
p2_position = p2['position']
angle_rad = math.radians(p2['orientation'])
dx = 10 * math.cos(angle_rad)
dy = 10 * math.sin(angle_rad)
if 'forward' == 'backward':
    dx = -dx
    dy = -dy
p2_new_position = Point(p2_position.getX() + dx, p2_position.getY() + dy)
if p2['pressure'] > 0:
    line = Line(p2_position, p2_new_position)
    line.setWidth(p2['thickness'])
    line.setFill(p2['color'])
    line.draw(Canvas1)
p2['position'] = p2_new_position
if 'right' == 'right':
    p2['orientation'] = (p2['orientation'] + 144) % 360
else:
    p2['orientation'] = (p2['orientation'] - 144) % 360
p2_position = p2['position']
angle_rad = math.radians(p2['orientation'])
dx = 10 * math.cos(angle_rad)
dy = 10 * math.sin(angle_rad)
if 'forward' == 'backward':
    dx = -dx
    dy = -dy
p2_new_position = Point(p2_position.getX() + dx, p2_position.getY() + dy)
if p2['pressure'] > 0:
    line = Line(p2_position, p2_new_position)
    line.setWidth(p2['thickness'])
    line.setFill(p2['color'])
    line.draw(Canvas1)
p2['position'] = p2_new_position
if 'right' == 'right':
    p2['orientation'] = (p2['orientation'] + 144) % 360
else:
    p2['orientation'] = (p2['orientation'] - 144) % 360
p2_position = p2['position']
angle_rad = math.radians(p2['orientation'])
dx = 10 * math.cos(angle_rad)
dy = 10 * math.sin(angle_rad)
if 'forward' == 'backward':
    dx = -dx
    dy = -dy
p2_new_position = Point(p2_position.getX() + dx, p2_position.getY() + dy)
if p2['pressure'] > 0:
    line = Line(p2_position, p2_new_position)
    line.setWidth(p2['thickness'])
    line.setFill(p2['color'])
    line.draw(Canvas1)
p2['position'] = p2_new_position

Canvas1.getMouse() 
Canvas1.close()