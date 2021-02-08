

import pygame

# Initialize the pygame engine
pygame.init()

# Create some color object constants used to add color to drawings
BLACK = pygame.Color(0, 0, 0, 255)
WHITE = pygame.Color(255, 255, 255, 255)

# Set height and width of the drawing surface
height = 480 #640
width = 480 #640
size = [width, height] # Note the ordering, first width, then height

# Create the drawing surface
screen = pygame.display.set_mode(size)
pygame.display.set_caption("A Triangle")

# Fill the drawing surface with the background color
print("Filling in Background")
screen.fill(WHITE)

p1 = [5, height - 5]
p2 = [(width - 10) / 2, 5]
p3 = [width - 5, height - 5]

print("Drawing Triangle")
pygame.draw.polygon(screen, BLACK, [p1, p2, p3], 1)

pygame.display.flip()

done = False
count = 0
while not done:
    count = count + 1
    if count % 1000000 == 0:
        print(".", end = "")
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            done = True

print("\nNow Quitting")
pygame.quit()
