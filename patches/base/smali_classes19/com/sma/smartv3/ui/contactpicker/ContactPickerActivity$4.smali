.class Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$4;
.super Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->loadContacts()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field callBack:Lcom/sma/smartv3/ui/contactpicker/LoadCallBack;

.field private helper:Lcom/sma/smartv3/ui/contactpicker/ContactHelper;

.field final synthetic this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$4;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;

    invoke-direct {p0}, Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;-><init>()V

    new-instance v0, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;

    invoke-direct {v0, p1}, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$4;->helper:Lcom/sma/smartv3/ui/contactpicker/ContactHelper;

    new-instance p1, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$4$1;

    invoke-direct {p1, p0}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$4$1;-><init>(Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$4;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$4;->callBack:Lcom/sma/smartv3/ui/contactpicker/LoadCallBack;

    return-void
.end method


# virtual methods
.method public doInBackground()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$4;->helper:Lcom/sma/smartv3/ui/contactpicker/ContactHelper;

    iget-object v1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$4;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->XXI(Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;)Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;

    move-result-object v1

    iget-object v1, v1, Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;->columnLimit:Lcom/sma/smartv3/ui/contactpicker/LimitColumn;

    iget-object v2, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$4;->callBack:Lcom/sma/smartv3/ui/contactpicker/LoadCallBack;

    invoke-virtual {v0, v1, v2}, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->load(Lcom/sma/smartv3/ui/contactpicker/LimitColumn;Lcom/sma/smartv3/ui/contactpicker/LoadCallBack;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public onCancel()V
    .locals 2

    invoke-super {p0}, Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;->onCancel()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$4;->helper:Lcom/sma/smartv3/ui/contactpicker/ContactHelper;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->setCancelLoad(Z)V

    return-void
.end method

.method public onFail(Ljava/lang/Throwable;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "t"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;->onFail(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$4;->helper:Lcom/sma/smartv3/ui/contactpicker/ContactHelper;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->setCancelLoad(Z)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "result"
        }
    .end annotation

    iget-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$4;->callBack:Lcom/sma/smartv3/ui/contactpicker/LoadCallBack;

    invoke-interface {p1}, Lcom/sma/smartv3/ui/contactpicker/LoadCallBack;->onComplete()V

    return-void
.end method
