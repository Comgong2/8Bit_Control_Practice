#include <stdio.h>

void printf_8_Bit(unsigned char Value)
{
	printf("DEC : %d\n", Value);
	printf("HEX : 0x%02X\n", Value);
	printf("BIN : ");
	for (int i = 7; i >= 0; i--)
		printf("%d", ((Value & (1 << i)) >> i));
	printf("B\n");
}

void main()
{
	printf("<8 Bit Control>\n");

	unsigned char Value_8_Bit = 0;								// 0000 0000
	printf("\nMake char Value \"Value_8_Bit\"\n");
	printf_8_Bit(Value_8_Bit);

	Value_8_Bit |= (1 << 0) | (1 << 2) | (1 << 4) | (1 << 6);	// 0000 0000 or 0101 0101 = 0101 0101
	printf("\nOR 0101 0101 to \"Value_8_Bit\"\n");
	printf_8_Bit(Value_8_Bit);

	Value_8_Bit = ~Value_8_Bit;									// NOT 0101 0101 = 1010 1010
	printf("\nInvert to \"Value_8_Bit\"\n");
	printf_8_Bit(Value_8_Bit);

	Value_8_Bit |= (1 << 0);									// 1010 1010 OR 0000 0001 = 1010 1011
	printf("\nOR 0000 0001 to \"Value_8_Bit\"\n");
	printf_8_Bit(Value_8_Bit);

	Value_8_Bit &= ~(1 << 0);									// 1010 1011 AND 1111 1110 = 1010 1010
	printf("\nAND 1111 1110 to \"Value_8_Bit\"\n");
	printf_8_Bit(Value_8_Bit);

	Value_8_Bit &= ~(Value_8_Bit);								// (NOT 1010 1010) AND 1010 1010 = 0101 0101 AND 1010 1010 = 0000 0000
	printf("\nAND 0101 0101 to \"Value_8_Bit\"\n");
	printf_8_Bit(Value_8_Bit);
	while (1);
}