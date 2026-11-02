.class Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ContactViewHolder"
.end annotation


# instance fields
.field private cbSelectedState:Landroidx/appcompat/widget/AppCompatCheckBox;

.field private final mView:Landroid/view/View;

.field final synthetic this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

.field private tvContactName:Landroid/widget/TextView;

.field private tvNumber:Landroid/widget/TextView;

.field private vRoundLetterView:Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;Landroid/view/View;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010,
            0x0
        }
        names = {
            "this$0",
            "view"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    iput-object p2, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;->mView:Landroid/view/View;

    const p1, 0x7f0a18e4

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;->vRoundLetterView:Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;

    const p1, 0x7f0a0c01

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;->tvContactName:Landroid/widget/TextView;

    const p1, 0x7f0a0c0d

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;->tvNumber:Landroid/widget/TextView;

    const p1, 0x7f0a0209

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/widget/AppCompatCheckBox;

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;->cbSelectedState:Landroidx/appcompat/widget/AppCompatCheckBox;

    return-void
.end method

.method public static bridge synthetic O00(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;)Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;->vRoundLetterView:Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;

    return-object p0
.end method

.method public static bridge synthetic OXO1(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;)Landroidx/appcompat/widget/AppCompatCheckBox;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;->cbSelectedState:Landroidx/appcompat/widget/AppCompatCheckBox;

    return-object p0
.end method

.method public static bridge synthetic XIi00iiXO(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;->mView:Landroid/view/View;

    return-object p0
.end method

.method public static bridge synthetic XO0O10(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;->tvNumber:Landroid/widget/TextView;

    return-object p0
.end method

.method public static bridge synthetic iO(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;->tvContactName:Landroid/widget/TextView;

    return-object p0
.end method
