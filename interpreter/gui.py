import tkinter as tk
from tkinter import filedialog
import subprocess

def open_file():
    filename = filedialog.askopenfilename()
    entry.delete(0, tk.END)
    entry.insert(0, filename)

def check_syntax():
    filename = entry.get()
    if filename:
        # Invoke lex and bison parser
        process = subprocess.Popen(['/home/ajaxcode/Public/output', filename], stdout=subprocess.PIPE, stderr=subprocess.PIPE)
        stdout, stderr = process.communicate()
        
        # Display results
        if stderr:
            result_label.config(text="Syntax Error: " + stderr.decode())
        else:
            result_label.config(text="Syntax is correct.")

# Create Tkinter application
root = tk.Tk()
root.title("Syntax Checker")

# File selection
file_label = tk.Label(root, text="Select a file:")
file_label.pack()

entry = tk.Entry(root, width=50)
entry.pack()

browse_button = tk.Button(root, text="Browse", command=open_file)
browse_button.pack()

# Syntax check button
check_button = tk.Button(root, text="Check Syntax", command=check_syntax)
check_button.pack()

# Result display
result_label = tk.Label(root, text="")
result_label.pack()

root.mainloop()
