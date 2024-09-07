# Syntax Analyzer for DummyC

### Course: Compiler Design Lab (CSP 353)  
### Semester: 6th  
### Branch: Computer Science and Engineering  
### Batch: B2  
### Team Members:
- **Anup Dhoble** (B27)
- **Dhyanesh Dharmik** (B40)
- **Akshat Shah** (B23)

### Project Coordinators:
- **Prof. Subhangi Tripide**, Associate Professor  
- **Prof. Vrushali Bongirwar**, Associate Professor  

## Project Overview
The Syntax Analyzer for DummyC is a simplified tool that performs lexical and syntactical analysis on C declaration statements using **Lex** and **Yacc** (or Flex and Bison). This project simulates a basic compiler's first stages, processing a subset of the C programming language. The tool is designed to be accessible via both command-line and a **Java GUI**, making it user-friendly for students and educators.

## Features
- **Lexical Analysis**: Tokenizes input to identify keywords, operators, and identifiers.
- **Syntax Parsing**: Ensures proper grammar based on C declaration rules.
- **Error Handling**: Provides detailed error messages for invalid tokens or improper syntax.
- **Java GUI**: Offers an intuitive interface to load files, execute parsing, and view results.
- **Command-line Support**: Can be executed directly via terminal for advanced users.

## Project Components
### Lex and Yacc
- **Lex File**: Defines the tokens (keywords, operators, etc.) and actions associated with each token.
- **Yacc File**: Implements grammar rules for valid C declarations. Defines how tokens are combined to form valid statements.

### Java GUI
The GUI consists of the following classes:
- **SSMain**: Main class to initialize the GUI.
- **MyFrame**: Extends `JFrame` to create the main window and UI elements.
- **Listener**: Handles mouse events for file selection and triggering the parsing process.

## Installation and Usage
### Prerequisites
- **Lex and Yacc** (or Flex and Bison) for compiling the lexer and parser.
- **Java** for running the GUI.

### Steps
1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/syntax-analyzer-dummyc.git
    ```
2. Navigate to the project directory:
    ```bash
    cd syntax-analyzer-dummyc
    ```
3. Compile the Lex and Yacc files:
    ```bash
    lex lexer.l
    yacc -d parser.y
    gcc lex.yy.c y.tab.c -o syntax_analyzer
    ```
4. Run the application in command-line mode:
    ```bash
    ./syntax_analyzer
    ```

### Running the Java GUI
1. Compile the Java classes:
    ```bash
    javac SSMain.java
    ```
2. Run the Java application:
    ```bash
    java SSMain
    ```
3. Use the GUI to load C declaration files, parse them, and view the results.

## Screenshots
### Input Screenshot
![Input](path/to/input-screenshot.png)

### Output Screenshot
![Output](path/to/output-screenshot.png)

## Conclusion
The project demonstrates a working syntax analyzer that provides comprehensive lexical and syntactical analysis for a simplified version of C. The use of Lex and Yacc, combined with a Java GUI, makes this tool valuable for both educational and practical purposes.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

You can customize the file paths and repository URL as per your GitHub repository. Let me know if you'd like any changes!
