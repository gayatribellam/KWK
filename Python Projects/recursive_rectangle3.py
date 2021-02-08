

import time
import pygame

colors = [pygame.Color(0, 0, 0, 255),
          pygame.Color(255, 0, 0, 255),
          pygame.Color(0, 255, 0, 255),
          pygame.Color(0, 0, 255, 255)]
WHITE = pygame.Color(255, 255, 255, 255)
BLACK = 0
RED = 1
GREEN = 2
BLUE = 3


def draw_rectangle(p1, w, h, color, line_width, screen):
    p2 = [p1[0] + w, p1[1]]
    p3 = [p1[0] + w, p1[1] + h]
    p4 = [p1[0], p1[1] + h]
    pygame.draw.polygon(screen, colors[color], [p1, p2, p3, p4], line_width)
    pygame.display.flip()    

def recursive_rectangle(degree, p1, w, h, color, line_width, screen):
    draw_rectangle(p1, w, h, color, line_width, screen)
    #color = (color + 1) % 2
    #line_width = (line_width + 1) % 2
    wait = 0.03
    if degree > 0:
        new_w = w / 3
        new_h = h / 3
        new_p2 = [p1[0] + new_w, p1[1] + new_h]
        new_p3 = [p1[0], p1[1] + new_h]
        new_p4 = [p1[0] + new_w, p1[1]]
        #time.sleep(wait)
        #color = (color + 1) % 4
        recursive_rectangle(degree - 1, p1, new_w, new_h, color, line_width, screen)
        #time.sleep(wait)
        #color = (color + 1) % 4
        recursive_rectangle(degree - 1, new_p2, new_h, new_w, color, line_width, screen)
        #time.sleep(wait)
        #color = (color + 1) % 4
        recursive_rectangle(degree - 1, new_p3, new_h, new_w, color, line_width, screen)
        #time.sleep(wait)
        #color = (color + 1) % 4
        recursive_rectangle(degree - 1, new_p4, new_h, new_w, color, line_width, screen)


def main():
    pygame.init()

    height = 640
    width = 640
    size = [width, height]

    p1 = [5, 5]
    w = width - 10
    h = height - 10
    initial_color = BLACK
    initial_line_width = 1

    degree = 4
    #degree = int(input("Please enter an integer degree: "))

    pygame.display.set_caption("Recursive Rectangle")
    screen = pygame.display.set_mode(size)
    screen.fill(WHITE)
    
    #draw_triangle(p1, p2, p3, BLACK, screen)
    recursive_rectangle(degree, p1, w, h, initial_color, initial_line_width, screen)

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
    
if __name__ == "__main__":
    main()
