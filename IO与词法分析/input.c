#include <stdio.h>
//缓冲区设置
#define MAXLINE 512 
#define BUFSIZE 4096
//指向缓冲区的双指针
extern unsigned char *cp;
extern unsigned char *limit;
//定义输出
extern int fileDescriptor;
extern char *firstFile; //源文件第一个文件名
extern char *file;      //输入文件名
extern char *line;      //行中字符坐标
extern int lineno;      //行号
//声明缓冲区
static int bsize;
static unsigned char buffer[BUFSIZE + 1 + MAXLINE + 1];
//初始化缓冲区
void inputInit(){
    
    limit=cp=&buffer[MAXLINE];
    bsize=-1;
    lineno=0;
    file=NULL;
    nextline();

}
//读取下一行
void nextline(){
    do
    {
        if(cp>=limit){
            //填充缓冲区
            // <refill buffer 80>
            if(cp==limit){
                return;
            }
        }else lineno++;
        for(line=(char*)cp;*cp==' '||*cp=='\t';cp++){
            ;
        }
    } while (*cp=='\n'&&cp==limit);
    if(*cp=='#'){
        resynch();
        nextline();
    }
    
}
void fillbuf(){
    if(bsize==0){
        return;
    }
    if(cp>=limit){
        cp=&buffer[MAXLINE+1];
    }else{}
    bsize=read(fileDescriptor,&buffer[MAXLINE+1],BUFSIZE);
    
}