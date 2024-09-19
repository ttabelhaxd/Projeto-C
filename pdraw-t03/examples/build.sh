# bash script to build the Compiler and Interpreter for the PDraw and ipdraw language
cd ../src/
antlr4-build -python ipdraw.g4 
antlr4-build -java PDraw.g4
cd ../examples/