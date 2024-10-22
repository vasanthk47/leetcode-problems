typedef struct ListNode node;
struct ListNode* middleNode(struct ListNode* head) {
    node* fast = head;
    node* slow = head;
    while(fast->next != NULL){
        if(fast->next->next == NULL)
            return slow->next;
        else{
        fast=fast->next->next;
        slow = slow->next;
        }
    }
    return slow;
}