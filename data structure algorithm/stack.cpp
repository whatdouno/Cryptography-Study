#include <stdio.h>
#define MAX_SIZE 100
/*MAX_SIZE��� ���� = 100���� �����ϴ� ��.*/

int stack[MAX_SIZE];
int top = -1;
/*������ ����� ������ STACK_SIZE�� �Ҵ��ϰ� �ش� �����ŭ�� �迭�� �����Ѵ�. 
���� ���� ���� ���Ҹ� ����ų top ������ -1�� �ʱ�ȭ�Ѵ�. 
�̴� ������ �ε����� 0���� �����ϱ� �����̴�.*/

int isEmpty() {
	if (top < 0) {
		return true;
	}
	else {
		return false;
	}
}

int isFull() {
	if (top >= MAX_SIZE-1) {
		return 1;
	}
	else {
		return 0;
	}
}

void push(int value) {
	if (isFull() == true) {
		printf("Stack full.\n");
	}
	else {
		stack[++top] = value;
	}
}

int pop() {
	if (isEmpty() == true) {
		printf("Stack is empty.\n");
		return 1;
	}
	else {
		return stack[top--];
	}
}

void printStack() {
	int i;
	for (i = 0; i <= top; i++) {
		printf("%d ", stack[i]);
	}
	printf("\n");
}


int main() {

	push(5);
	push(4);
	push(3);
	push(2);
	push(1);
	printStack();
	pop();
	printStack();
	return 0;

}