import sys
import pygame


pygame.init() # Start-up command for all of pygame's modules

width = 640  # The horizontal size of the drawing surface
height = 480 # The vertical size of the drawing surface

# The first value in the list determines the horizontal movement of the object
# The second value in the list determines the vertical movement.
# In this case, the object will move two pixels to the right,
# and two pixles down
speed = [2, 2] # We are going to use this to control the speed at which the
               # animated image moves.

# Here we are using a four value system to define a color:
#    pygame.Color(r, g, b, a)
# r - stands for the amount of red
# g - stands for the amount of green
# b - stands for the amount of blue
# a - stands for alpha, which determines the transparency or opacity of the color
#     higher values means less transparent/more opaque
# Each of the parameters takes an integer value between 0 and 255
# Every possible color drawn by Pygame is a combination of these four values.
# Black is defined by adding 0 of red, green, and blue, while setting the
# alpha to 255 for maximum opacity.
black = pygame.Color(0, 0, 0, 255) # Creates a pygame Color object

# It is also possible to use string color names to create Color objects in Pygame
# See the list linked in the slides
black = pygame.Color("black")

# Here we create the drawing surfce using the set_mode function of the
# display library. We pass in a list giving the width and the height in
# exactly that order.
screen = pygame.display.set_mode([width, height])

# This loads the image file for the ball.
ball = pygame.image.load("ball.gif")
# This defines the rectangular boundaries of the ball image.
# We will use this information to control its motion across the surface.
ballrect = ball.get_rect()

while True:
    # We move the container of the image according to the current values of
    # speed
    ballrect = ballrect.move(speed)

    # This is how we get bouncing.
    # If the ball hits the left or right boundary, then we reverse its
    # horizontal motion
    if ballrect.left < 0 or ballrect.right > width:
        speed[0] = -speed[0]
    # If the ball hits the top or bottom boundaries of the surface, then
    # we reverse its vertical motion
    if ballrect.top < 0 or ballrect.bottom > height:
        speed[1] = -speed[1]

    # We fill the screen with black to wipe out the old image and replace with
    # a new one. Like a flip book.
    screen.fill(black)

    # This method is used to actually draw the image onto the screen.
    screen.blit(ball, ballrect)

    # This is used to reveal the drawing we have done in the above commands
    # on the drawing surface.
    pygame.display.flip()

    # This code is used to cleanly exit when clicking the x in the top-right
    # of the drawing window.
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            pygame.quit()
