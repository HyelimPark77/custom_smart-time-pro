.class Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$2;
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

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$2;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "view"
        }
    .end annotation

    iget-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$2;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->iIiiO(Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;)V

    return-void
.end method
