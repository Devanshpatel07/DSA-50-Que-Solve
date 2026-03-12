#include<stdio.h>
#include<ctype.h>

char production[10][10];
int n;

void findFirst(char c){
    int i;

    for(i=0;i<n;i++){
        if(production[i][0]==c){

            if(islower(production[i][2])){
                printf("%c ",production[i][2]);
            }
            else{
                findFirst(production[i][2]);
            }
        }
    }
}

void findFollow(char c){
    int i,j;

    for(i=0;i<n;i++){
        for(j=2;production[i][j]!='\0';j++){

            if(production[i][j]==c){

                if(production[i][j+1]!='\0')
                    printf("%c ",production[i][j+1]);

                if(production[i][j+1]=='\0')
                    findFollow(production[i][0]);
            }
        }
    }
}

int main(){

    int i;
    char c;

    printf("Enter number of productions: ");
    scanf("%d",&n);

    printf("Enter productions:\n");

    for(i=0;i<n;i++)
        scanf("%s",production[i]);

    printf("Enter symbol to find FIRST: ");
    scanf(" %c",&c);

    printf("FIRST(%c) = ",c);
    findFirst(c);

    printf("\nEnter symbol to find FOLLOW: ");
    scanf(" %c",&c);

    printf("FOLLOW(%c) = ",c);
    findFollow(c);

    return 0;
}