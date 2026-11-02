.class Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

.field final synthetic val$contactItem:Lcom/sma/smartv3/ui/contactpicker/Contact;

.field final synthetic val$i:I


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;Lcom/sma/smartv3/ui/contactpicker/Contact;I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010,
            0x1010
        }
        names = {
            "this$0",
            "val$contactItem",
            "val$i"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$1;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

    iput-object p2, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$1;->val$contactItem:Lcom/sma/smartv3/ui/contactpicker/Contact;

    iput p3, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$1;->val$i:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "view"
        }
    .end annotation

    iget-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$1;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

    invoke-static {p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->OXO1(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;)Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;

    move-result-object p1

    iget p1, p1, Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;->maxSelectCount:I

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$1;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->getSelectedContactsCount()I

    move-result p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$1;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

    invoke-static {v0}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->OXO1(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;)Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;

    move-result-object v0

    iget v0, v0, Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;->maxSelectCount:I

    if-le p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$1;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->getSelectedContactsCount()I

    move-result p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$1;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

    invoke-static {v0}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->OXO1(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;)Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;

    move-result-object v0

    iget v0, v0, Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;->maxSelectCount:I

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$1;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

    invoke-static {p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->XIi00iiXO(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$1;->val$contactItem:Lcom/sma/smartv3/ui/contactpicker/Contact;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/contactpicker/Contact;->getId()J

    move-result-wide v1

    invoke-static {p1, v0, v1, v2}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->OIi0(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;Ljava/util/List;J)I

    move-result p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$1;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

    invoke-static {v0}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->XIi00iiXO(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/contactpicker/Contact;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/contactpicker/Contact;->isSelected()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$1;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$1;->val$contactItem:Lcom/sma/smartv3/ui/contactpicker/Contact;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/contactpicker/Contact;->getId()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->setContactSelected(J)V

    goto :goto_1

    :cond_1
    :goto_0
    return-void

    :cond_2
    iget-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$1;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$1;->val$contactItem:Lcom/sma/smartv3/ui/contactpicker/Contact;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/contactpicker/Contact;->getId()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->setContactSelected(J)V

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$1;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$1;->val$contactItem:Lcom/sma/smartv3/ui/contactpicker/Contact;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/contactpicker/Contact;->getId()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->setContactSelected(J)V

    :goto_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$1;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

    invoke-static {p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->XO0O10(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;)Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactSelectListener;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$1;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

    invoke-static {p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->XO0O10(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;)Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactSelectListener;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$1;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

    iget v1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$1;->val$i:I

    invoke-static {v0, v1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->I0IIOi(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;I)Lcom/sma/smartv3/ui/contactpicker/Contact;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$1;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->getSelectedContactsCount()I

    move-result v1

    invoke-interface {p1, v0, v1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactSelectListener;->onContactSelected(Lcom/sma/smartv3/ui/contactpicker/Contact;I)V

    :cond_4
    iget-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$1;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method
