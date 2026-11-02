.class Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$4$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$4$1;->onNext(Lcom/sma/smartv3/ui/contactpicker/Contact;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$2:Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$4$1;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$4$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$2"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$4$1$1;->this$2:Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$4$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$4$1$1;->this$2:Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$4$1;

    iget-object v0, v0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$4$1;->this$1:Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$4;

    iget-object v0, v0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$4;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->OIX0iXi(Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;)Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$4$1$1;->this$2:Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$4$1;

    iget-object v0, v0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$4$1;->this$1:Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$4;

    iget-object v0, v0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$4;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->OIX0iXi(Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;)Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method
