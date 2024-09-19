# bash script to compile the desired file
if [ -z "$1" ]; then
  echo "Usage: $0 <file.pdraw>"
  exit 1
fi
FILE_PATH=$(realpath "$1")
cd ../src/
echo "Compiling ..."
java PDrawMain "$FILE_PATH"
cd ../examples/