package main

import (
    "bufio"
    "fmt"
    "io"
    "os"
    "strconv"
    "strings"
)

func simpleArraySum(ar []int32) (sum int32){
	sum = 0
	for i := 0; i < len(ar); i+=1{
		sum += ar[i]
	}
	return
}

func main() {
    reader := bufio.NewReaderSize(os.Stdin, 1024 * 1024)

    stdout, err := os.Create(os.Getenv("OUTPUT_PATH"))
    checkError(err)

    defer stdout.Close()

    writer := bufio.NewWriterSize(stdout, 1024 * 1024)

    arCount, err := strconv.ParseInt(readLine(reader), 10, 64)
    checkError(err)

    arTemp := strings.Split(readLine(reader), " ")

    var ar []int32

    for arItr := 0; arItr < int(arCount); arItr++ {
        arItemTemp, err := strconv.ParseInt(arTemp[arItr], 10, 64)
        checkError(err)
        arItem := int32(arItemTemp)
        ar = append(ar, arItem)
    }

    result := simpleArraySum(ar)

    fmt.Fprintf(writer, "%d\n", result)

    writer.Flush()
}

func readLine(reader *bufio.Reader) string {
    str, _, err := reader.ReadLine()
    if err == io.EOF {
        return ""
    }

    return strings.TrimRight(string(str), "\r\n")
}

func checkError(err error) {
    if err != nil {
        panic(err)
    }
}
