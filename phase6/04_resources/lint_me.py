"""
This is a file for trying out Pylint
"""
import os

def open_foo_file(): #The
    try:
        os.chdir("subdir")
        filedesc = open("foo.txt", "w", encoding="UTF-8")
        contents = filedesc.readlines()
        filedesc.close()
    except FileNotFoundError:
        print("couldn't find the file or directory")
    return contents

if __name__ == "__main__":
    open_foo_file()
