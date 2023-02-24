import time

from easygui import buttonbox, msgbox  # 导入easygui中的buttonbox,msgbox
import datetime  # 导入datetime
from random import choice  # 从random导入choice
import math
a=int(input('输入时间 小时'))
b=int(input('输入时间 分钟'))
c=a+9
d=b+15
e=d+20
f=c
if (60 <=d):
    d=0
    c+=1
    if(24<=c):
        c=0
if (60 <=e):
                e=0
                f+=1
                if(24<=f):
                  f=0
print(e)
print(f)
coms = ['亲爱的杨升，您的小助手1提醒您：',
        '亲爱的杨升，您的小助手2提醒您：',
        '亲爱的杨升，您的小助手3提醒您：',
        '亲爱的杨升，您的小助手4提醒您：',
        '亲爱的杨升，您的小助手5提醒您：',
        '亲爱的杨升，您的小助手6提醒您：',
        '亲爱的杨升，您的小助手7提醒您：',
        '亲爱的杨升，您的小助手8提醒您：',
        '亲爱的杨升，您的小助手9提醒您：',
        '亲爱的杨升，您的小助手10提醒您：']  # 报时公司列表
com = choice(coms)  # 随机从列表中选择一个报时公司
cs = buttonbox(msg=com + '\n'+'\n' +'您的上班时间为：'+str(a)+':'+str(b)+'\n'+'\n' +\
                   '您的下班打卡时间为'+str(c)+':'+str(d)+'至'+str(f)+':'+str(e), \
               title="第1次为您报时",
               choices=("知道啦，退下吧！","好0.0——0.0再来一次"))
# 用buttonbox来进行选择

if cs == "知道啦，退下吧！":  # 如果知道了就结束
    pass


num = 2  # 第2次
while cs == "好0.0——0.0再来一次":
    cs = buttonbox(msg=com + '\n' + '\n' + '您的上班时间为：' + str(a) + ':' + str(b) + '\n' + '\n' + \
                       '您的下班打卡时间为' + str(c) + ':' + str(d) + '至' + str(f) + ':' + str(e), \
                   title="第"+str(num)+"次为您报时",
                   choices=("知道啦，退下吧！", "好0.0——0.0再来一次"))
    num += 1  # +1