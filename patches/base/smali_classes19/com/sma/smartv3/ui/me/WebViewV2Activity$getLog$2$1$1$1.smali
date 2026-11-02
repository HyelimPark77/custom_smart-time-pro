.class public final Lcom/sma/smartv3/ui/me/WebViewV2Activity$getLog$2$1$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/WebViewV2Activity;->getLog(Lcom/android/mltcode/paycertificationapi/X1OI0;)V
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
.field public final synthetic OXO1:Ljava/io/File;

.field public final synthetic XIi00iiXO:Lcom/sma/smartv3/ui/me/WebViewV2Activity;

.field public final synthetic iO:Lcom/android/mltcode/paycertificationapi/X1OI0;


# direct methods
.method public constructor <init>(Ljava/io/File;Lcom/sma/smartv3/ui/me/WebViewV2Activity;Lcom/android/mltcode/paycertificationapi/X1OI0;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity$getLog$2$1$1$1;->OXO1:Ljava/io/File;

    iput-object p2, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity$getLog$2$1$1$1;->XIi00iiXO:Lcom/sma/smartv3/ui/me/WebViewV2Activity;

    iput-object p3, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity$getLog$2$1$1$1;->iO:Lcom/android/mltcode/paycertificationapi/X1OI0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity$getLog$2$1$1$1;->OXO1:Ljava/io/File;

    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "UPLOADED_LOG_TIME"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;J)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity$getLog$2$1$1$1;->XIi00iiXO:Lcom/sma/smartv3/ui/me/WebViewV2Activity;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity$getLog$2$1$1$1;->iO:Lcom/android/mltcode/paycertificationapi/X1OI0;

    invoke-virtual {v0, p1, v1}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->sendBleInfo(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/X1OI0;)V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity$getLog$2$1$1$1;->OXO1:Ljava/io/File;

    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity$getLog$2$1$1$1;->XIi00iiXO:Lcom/sma/smartv3/ui/me/WebViewV2Activity;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity$getLog$2$1$1$1;->iO:Lcom/android/mltcode/paycertificationapi/X1OI0;

    invoke-virtual {v0, p1, v1}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->sendBleInfo(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/X1OI0;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/WebViewV2Activity$getLog$2$1$1$1;->OXO1(Ljava/lang/String;)V

    return-void
.end method
