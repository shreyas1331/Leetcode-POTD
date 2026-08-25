# 1927. Sum Game
class Solution:
    def sumGame(self, num: str) -> bool:
        lq = rq = 0
        ls = rs = 0
        n = len(num)
        for i in range(n//2):
            if num[i]=='?':
                lq+=1
            else:
                ls+=int(num[i])
        for i in range(n//2,n):
            if num[i]=='?':
                rq+=1
            else:
                rs+=int(num[i])
        mn = min(lq,rq)
        lq-=mn
        rq-=mn
        if (lq==0 and rq==0) and ls==rs:
            return False
        elif lq==0 and rq!=0:
            if rq%2==0 and ls-rs==(rq//2)*9:
                return False
        elif rq==0 and lq!=0:
            if lq%2==0 and rs-ls==(lq//2)*9:
                return False
        return True