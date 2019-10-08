class MyCircularQueue:

    def __init__(self, k: int):
        """
        Initialize your data structure here. Set the size of the queue to be k.
        """
        self.size = k
        self.queue = []
        self.head = None
        self.tail = None

    def enQueue(self, value: int) -> bool:
        """
        Insert an element into the circular queue. Return true if the operation is successful.
        """
        if len(self.queue) < self.size:
            self.queue.append(value)
            if self.head is None:
                self.head = 0
                self.tail = 0

            else:
                self.tail = (self.tail + 1) % self.size

            return True

        return False

    def deQueue(self) -> bool:
        """
        Delete an element from the circular queue. Return true if the operation is successful.
        """
        if len(self.queue) > 0 and self.head is not None:
            print(self.queue)
            print(self.head)
            self.queue.pop(self.head)
            if len(self.queue) == 0:
                self.head, self.tail = None, None
            else:
                self.tail = (self.tail - 1) % self.size
            return True

        else:
            self.head = None
            self.tail = None

        return False

    def Front(self) -> int:
        """
        Get the front item from the queue.
        """
        if self.head is not None:
            return self.queue[self.head]
        return -1

    def Rear(self) -> int:
        """
        Get the last item from the queue.
        """
        if self.tail is not None:
            return self.queue[self.tail]
        return -1

    def isEmpty(self) -> bool:
        """
        Checks whether the circular queue is empty or not.
        """
        return len(self.queue) == 0

    def isFull(self) -> bool:
        """
        Checks whether the circular queue is full or not.
        """
        return len(self.queue) == self.size
