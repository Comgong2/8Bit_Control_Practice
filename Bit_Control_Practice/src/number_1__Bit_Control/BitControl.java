package number_1__Bit_Control;

public class BitControl {
	
	static void printf_8_Bit(byte Value)
	{
		int nValue;
		if (Value < 0)
			 nValue = (int)Value + 256;
		else
			 nValue = (int)Value;
		
		System.out.printf("DEC : %d\n", nValue);
		System.out.printf("HEX : 0x%02X\n", Value);
		System.out.printf("BIN : ");
		for (int i = 7; i >= 0; i--)
			System.out.printf("%d", ((Value & (1 << i)) >> i));
		System.out.printf("B\n");
	}

	public static void main(String[] args) {
		System.out.printf("<8 Bit Control>\n");
		
		byte Value_8_Bit = 0;								// 0000 0000
		System.out.printf("\nMake char Value \"Value_8_Bit\"\n");
		printf_8_Bit(Value_8_Bit);

		Value_8_Bit |= (1 << 0) | (1 << 2) | (1 << 4) | (1 << 6);	// 0000 0000 or 0101 0101 = 0101 0101
		System.out.printf("\nOR 0101 0101 to \"Value_8_Bit\"\n");
		printf_8_Bit(Value_8_Bit);

		Value_8_Bit = (byte) ~Value_8_Bit;									// NOT 0101 0101 = 1010 1010
		System.out.printf("\nInvert to \"Value_8_Bit\"\n");
		printf_8_Bit(Value_8_Bit);
		
		Value_8_Bit |= (1 << 0);									// 1010 1010 OR 0000 0001 = 1010 1011
		System.out.printf("\nOR 0000 0001 to \"Value_8_Bit\"\n");
		printf_8_Bit(Value_8_Bit);

		Value_8_Bit &= ~(1 << 0);									// 1010 1011 AND 1111 1110 = 1010 1010
		System.out.printf("\nAND 1111 1110 to \"Value_8_Bit\"\n");
		printf_8_Bit(Value_8_Bit);

		Value_8_Bit &= ~(Value_8_Bit);								// (NOT 1010 1010) AND 1010 1010 = 0101 0101 AND 1010 1010 = 0000 0000
		System.out.printf("\nAND 0101 0101 to \"Value_8_Bit\"\n");
		printf_8_Bit(Value_8_Bit);

		
	}
}
