class Solution:
    """
    @param strs: a list of strings
    @return: encodes a list of strings to a single string.
    """
    def encode(self, strs: list[str]) -> str:
        res = ""
        for s in strs:
            # Format: Length of string + delimiter + string itself
            # Example: "Hello" -> "5#Hello"
            res += str(len(s)) + "#" + s
        return res

    """
    @param str: A string
    @return: decodes a single string to a list of strings
    """
    def decode(self, s: str) -> list[str]:
        res = []
        i = 0
        
        while i < len(s):
            j = i
            while s[j] != "#":
                j += 1
            
            length = int(s[i:j])
            
            start = j + 1
            end = start + length
            
            res.append(s[start:end])
            
            i = end
            
        return res