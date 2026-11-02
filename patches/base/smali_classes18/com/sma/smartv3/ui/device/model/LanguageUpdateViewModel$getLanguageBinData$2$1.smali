.class public final Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$getLanguageBinData$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/androidnetworklib/method/HttpProgressCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getLanguageBinData(Lcom/android/mltcode/paycertificationapi/rk;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/sma/androidnetworklib/method/HttpProgressCallback<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

.field public final synthetic XIi00iiXO:Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/coroutines/Continuation<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$getLanguageBinData$2$1;->OXO1:Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$getLanguageBinData$2$1;->XIi00iiXO:Lkotlin/coroutines/Continuation;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 3

    const-string p1, "upgrade"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$getLanguageBinData$2$1;->OXO1:Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getPopup()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/mltcode/paycertificationapi/qk$OXO1;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$getLanguageBinData$2$1;->OXO1:Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v1

    const v2, 0x7f140de8

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/qk$OXO1;->XiOIO(Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/qk$OXO1;->O10IXXX0X(I)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getPopup()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$getLanguageBinData$2$1;->XIi00iiXO:Lkotlin/coroutines/Continuation;

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$getLanguageBinData$2$1;->XIi00iiXO:Lkotlin/coroutines/Continuation;

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public handleProgress(I)V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$getLanguageBinData$2$1;->OXO1:Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->access$getTAG$p(Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "handleProgress: Progress = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$getLanguageBinData$2$1;->OXO1:Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getPopup()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/qk$OXO1;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$getLanguageBinData$2$1;->OXO1:Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/qk$OXO1;->O10IXXX0X(I)V

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getPopup()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$getLanguageBinData$2$1;->OXO1(Ljava/lang/String;)V

    return-void
.end method
