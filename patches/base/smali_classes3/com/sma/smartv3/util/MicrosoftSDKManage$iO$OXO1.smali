.class public final Lcom/sma/smartv3/util/MicrosoftSDKManage$iO$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OXO1"
.end annotation


# direct methods
.method public static OXO1(Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;ILjava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p0    # Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "str"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "detectedLanguage"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;->OXO1(Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method
