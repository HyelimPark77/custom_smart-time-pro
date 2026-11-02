.class Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$3;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "view"
        }
    .end annotation

    iget-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$3;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->I0iXXO(Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->XiOIO(Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$3;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->OIX0iXi(Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;)Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$3;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->OIX0iXi(Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;)Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$3;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->I0iXXO(Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;)Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->setAllSelected(Z)V

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$3;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->I0iXXO(Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$3;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->IIX1OXO(Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;)Landroid/widget/TextView;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$3;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;

    const v1, 0x7f141328

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$3;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->IIX1OXO(Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;)Landroid/widget/TextView;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$3;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;

    const v1, 0x7f141327

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
