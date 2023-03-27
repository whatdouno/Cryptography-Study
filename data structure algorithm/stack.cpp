#include <stdio.h>
#define MAX_SIZE 100
/*MAX_SIZE라는 변수 = 100으로 규정하는 것.*/

int stack[MAX_SIZE];
int top = -1;
/*스택의 사이즈를 결정할 STACK_SIZE를 할당하고 해당 사이즈만큼의 배열을 선언한다. 
또한 가장 위의 원소를 가리킬 top 변수를 -1로 초기화한다. 
이는 스택의 인덱스를 0부터 시작하기 위함이다.*/

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