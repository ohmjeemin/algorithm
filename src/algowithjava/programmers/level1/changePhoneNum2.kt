package algowithjava.programmers.level1

fun solution(phone_number: String): String {
    var answer = phone_number.toCharArray()
    for(i in 0 until answer.size-4) {
        answer[i] = '*'
    }
    return String(answer)
}

fun main() {
    solution("01033334444")
}