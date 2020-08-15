#!/bin/bash
FILE="$1"
if ls $FILE/*.java &>/dev/null
then
   echo "Ada file Java pada direktori $FILE."
else
   echo "Tidak ada file Java pada direktori $FILE." >&2
fi
