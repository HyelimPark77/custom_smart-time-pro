.class public final Lcom/sma/smartv3/util/UtilsKt$showAiKeyPopup$1$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/util/UtilsKt;->XXiO0i(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Ljava/lang/String;

.field public final synthetic XIi00iiXO:Lcom/sma/smartv3/pop/AiKeyEditPopup;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/sma/smartv3/pop/AiKeyEditPopup;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/util/UtilsKt$showAiKeyPopup$1$1$1;->OXO1:Ljava/lang/String;

    iput-object p2, p0, Lcom/sma/smartv3/util/UtilsKt$showAiKeyPopup$1$1$1;->XIi00iiXO:Lcom/sma/smartv3/pop/AiKeyEditPopup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 2

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "OPENAI_KEY"

    iget-object v1, p0, Lcom/sma/smartv3/util/UtilsKt$showAiKeyPopup$1$1$1;->OXO1:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/util/UtilsKt$showAiKeyPopup$1$1$1;->XIi00iiXO:Lcom/sma/smartv3/pop/AiKeyEditPopup;

    invoke-virtual {p1}, Landroidx/fragment/app/DialogFragment;->dismiss()V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/util/UtilsKt$showAiKeyPopup$1$1$1;->OXO1(Ljava/lang/String;)V

    return-void
.end method
