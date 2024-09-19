from graphics import *
import time, math, os, sys
sys.path.insert(0, os.path.abspath(os.path.join(os.path.dirname(__file__), '../src')))
from IPDrawInterpreter import run_interpreter
Canvas1 = GraphWin('Example 1', 100, 100)
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
    line.draw(Canvas1)
p1['position'] = p1_new_position
p1['color'] = 'red'
if 'left' == 'right':
    p1['orientation'] = (p1['orientation'] + 10) % 360
else:
    p1['orientation'] = (p1['orientation'] - 10) % 360
p1_position = p1['position']
angle_rad = math.radians(p1['orientation'])
dx = 10 * math.cos(angle_rad)
dy = 10 * math.sin(angle_rad)
if 'backward' == 'backward':
    dx = -dx
    dy = -dy
p1_new_position = Point(p1_position.getX() + dx, p1_position.getY() + dy)
if p1['pressure'] > 0:
    line = Line(p1_position, p1_new_position)
    line.setWidth(p1['thickness'])
    line.setFill(p1['color'])
    line.draw(Canvas1)
p1['position'] = p1_new_position
p1['color'] = 'blue'
if 'right' == 'right':
    p1['orientation'] = (p1['orientation'] + 20) % 360
else:
    p1['orientation'] = (p1['orientation'] - 20) % 360
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
    line.draw(Canvas1)
p1['position'] = p1_new_position
x = 5
y = 10
p1['position'] = (x, y)
x = int(input("x: "))
y = int(input("y: "))
p1['position'] = (x, y)
print(p1)
print("\n")
time.sleep(0)
p1p1_position = p1['position']
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
    line.draw(Canvas1)
p1['position'] = p1_new_position
time.sleep(0)
if 'left' == 'right':
    p1['orientation'] = (p1['orientation'] + 10) % 360
else:
    p1['orientation'] = (p1['orientation'] - 10) % 360
p1_position = p1['position']
angle_rad = math.radians(p1['orientation'])
dx = 20 * math.cos(angle_rad)
dy = 20 * math.sin(angle_rad)
if 'forward' == 'backward':
    dx = -dx
    dy = -dy
p1_new_position = Point(p1_position.getX() + dx, p1_position.getY() + dy)
if p1['pressure'] > 0:
    line = Line(p1_position, p1_new_position)
    line.setWidth(p1['thickness'])
    line.setFill(p1['color'])
    line.draw(Canvas1)
p1['position'] = p1_new_position
p1['position'] = (0, 0)
p1['pressure'] = 1
p1p1_position = p1['position']
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
    line.draw(Canvas1)
p1['position'] = p1_new_position
if 'right' == 'right':
    p1['orientation'] = (p1['orientation'] + 144) % 360
else:
    p1['orientation'] = (p1['orientation'] - 144) % 360
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
    line.draw(Canvas1)
p1['position'] = p1_new_position
if 'right' == 'right':
    p1['orientation'] = (p1['orientation'] + 144) % 360
else:
    p1['orientation'] = (p1['orientation'] - 144) % 360
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
    line.draw(Canvas1)
p1['position'] = p1_new_position
if 'right' == 'right':
    p1['orientation'] = (p1['orientation'] + 144) % 360
else:
    p1['orientation'] = (p1['orientation'] - 144) % 360
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
    line.draw(Canvas1)
p1['position'] = p1_new_position
if 'right' == 'right':
    p1['orientation'] = (p1['orientation'] + 144) % 360
else:
    p1['orientation'] = (p1['orientation'] - 144) % 360
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
    line.draw(Canvas1)
p1['position'] = p1_new_position
p1 = p1
p1['position'] = Point(p1['position'].getX() + 5, p1['position'].getY() + 5)

p1['color'] = 'green'
i = None
i = 0

while i < 5:
    p1p1_position = p1['position']
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
        line.draw(Canvas1)
    p1['position'] = p1_new_position
    if 'right' == 'right':
        p1['orientation'] = (p1['orientation'] + 144) % 360
    else:
        p1['orientation'] = (p1['orientation'] - 144) % 360


    i = i + 1

pn = {'color': 'black', 'position': Point(0,0), 'orientation': 0, 'thickness': 1, 'pressure': 0}
pn['color'] = 'blue'
pn['thickness'] = 10
pn['pressure'] = 1 / 2
length = None
angle = None
done = False
while not (done):
    length = int(input("length: "))

    p1_position = p1['position']
    angle_rad = math.radians(p1['orientation'])
    dx = length * math.cos(angle_rad)
    dy = length * math.sin(angle_rad)
    if 'forward' == 'backward':
        dx = -dx
        dy = -dy
    p1_new_position = Point(p1_position.getX() + dx, p1_position.getY() + dy)
    if p1['pressure'] > 0:
        line = Line(p1_position, p1_new_position)
        line.setWidth(p1['thickness'])
        line.setFill(p1['color'])
        line.draw(Canvas1)
    p1['position'] = p1_new_position

    angle = float(input("rotation angle (degrees): ")) * math.pi / 180

    if 'left' == 'right':
        p1['orientation'] = (p1['orientation'] + angle) % 360
    else:
        p1['orientation'] = (p1['orientation'] - angle) % 360

    t = input("finish (y/N)?: ")

    done = (t == "y" or t == "Y")



Canvas1.getMouse() 
Canvas1.close()