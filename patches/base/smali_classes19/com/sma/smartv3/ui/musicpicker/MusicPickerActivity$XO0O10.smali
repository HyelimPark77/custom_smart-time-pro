.class public Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;
.super Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->loadMusics()V
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
.field public I1:Lcom/android/mltcode/paycertificationapi/jw0;

.field public IO:Lcom/android/mltcode/paycertificationapi/iw0;

.field public final synthetic iX1O1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;->iX1O1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;

    invoke-direct {p0}, Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iw0;

    invoke-direct {v0, p1}, Lcom/android/mltcode/paycertificationapi/iw0;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;->IO:Lcom/android/mltcode/paycertificationapi/iw0;

    new-instance p1, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10$OXO1;

    invoke-direct {p1, p0}, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10$OXO1;-><init>(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;->I1:Lcom/android/mltcode/paycertificationapi/jw0;

    return-void
.end method


# virtual methods
.method public doInBackground()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;->IO:Lcom/android/mltcode/paycertificationapi/iw0;

    iget-object v1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;->I1:Lcom/android/mltcode/paycertificationapi/jw0;

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/iw0;->XO0O10(Lcom/android/mltcode/paycertificationapi/jw0;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public onCancel()V
    .locals 2

    invoke-super {p0}, Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;->onCancel()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;->IO:Lcom/android/mltcode/paycertificationapi/iw0;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/iw0;->O00(Z)V

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;->IO:Lcom/android/mltcode/paycertificationapi/iw0;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/iw0;->O00(Z)V

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

    iget-object p1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;->I1:Lcom/android/mltcode/paycertificationapi/jw0;

    invoke-interface {p1}, Lcom/android/mltcode/paycertificationapi/jw0;->onComplete()V

    return-void
.end method
