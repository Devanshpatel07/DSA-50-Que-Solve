#include<stdio.h>
#include<ctype.h>
#include<string.h>

char production[10][10];
char first[10];
char follow[10];
int n;

void findFirst(char c, int q, int r) {
    int i, j;

    if(!(isupper(c))) {
        first[r++] = c;
    }

    for(i = 0; i < n; i++) {
        if(production[i][0] == c) {

            if(production[i][2] == '$')
                first[r++] = '$';

            else if(islower(production[i][2]))
                first[r++] = production[i][2];

            else
                findFirst(production[i][2], i, r);
        }
    }
}

void findFollow(char c) {
    int i, j;

    if(production[0][0] == c)
        follow[0] = '$';

    for(i = 0; i < n; i++) {
        for(j = 2; j < strlen(production[i]); j++) {

            if(production[i][j] == c) {

                if(production[i][j+1] != '\0')
                    findFirst(production[i][j+1], i, j+2);

                if(production[i][j+1] == '\0' && c != production[i][0])
                    findFollow(production[i][0]);
            }
        }
    }
}

int main() {

    int i;
    char c;

    printf("Enter number of productions: ");
    scanf("%d",&n);

    printf("Enter productions (Example: E=TR)\n");

    for(i = 0; i < n; i++)
        scanf("%s",production[i]);

    printf("Find FIRST of: ");
    scanf(" %c",&c);

    findFirst(c,0,0);

    printf("FIRST(%c) = { ",c);
    for(i=0;i<strlen(first);i++)
        printf("%c ",first[i]);
    printf("}\n");

    printf("Find FOLLOW of: ");
    scanf(" %c",&c);

    findFollow(c);

    printf("FOLLOW(%c) = { ",c);
    for(i=0;i<strlen(follow);i++)
        printf("%c ",follow[i]);
    printf("}\n");

}