class Node<T>(content: T) {
    val content: T = content
    var next: Node<T>? = null
}

fun main(args: Array<String>) {
    var second = Node<String>("la")
    var third = Node<String>("le")
    var head = Node<String>("head")
    head.next = second

    println(head.next?.next?.content)
}
