package hyperJump;

public final class ByteDecoder {
	public static boolean validJumpDetected, invalidJumpDetected, gameTimeOver, finalScoreReceived;

	public static void resetFlags() {
		validJumpDetected = invalidJumpDetected = gameTimeOver = finalScoreReceived = false;
	}

	public static void updateFlags(msg m) {
		byte b = m.getPayLoad();
		if (b == (byte) 0b00000000) {
			gameTimeOver = true;
		} else if (b == (byte) 0b00000001) {
			invalidJumpDetected = true;
		} else if (b == (byte) 0b000000010) {
			validJumpDetected = true;
		} else {
			finalScoreReceived = true;
		}

	}

}