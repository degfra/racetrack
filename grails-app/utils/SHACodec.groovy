import java.security.MessageDigest

class SHA1Codec{
	static encode = {target->
		MessageDigest md = MessageDigest.getInstance("SHA1")
		md.update(target.getBytes('UTF-8'))
		return new String(md.digest()).encodeAsBase64()
	}
}