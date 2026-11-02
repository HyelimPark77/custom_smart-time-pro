.class public final Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity$syncWatchFace$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/androidnetworklib/method/HttpProgressCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->syncWatchFace(Lcom/sma/smartv3/model/WatchFaceInfo;)V
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
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;

.field public final synthetic XIi00iiXO:Ljava/lang/String;

.field public final synthetic iO:Ljava/io/File;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;Ljava/lang/String;Ljava/io/File;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity$syncWatchFace$2;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;

    iput-object p2, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity$syncWatchFace$2;->XIi00iiXO:Ljava/lang/String;

    iput-object p3, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity$syncWatchFace$2;->iO:Ljava/io/File;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 7

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity$syncWatchFace$2;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " syncWatchFace -> WatchFace try get from net"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v2, Lcom/szabh/smable3/BleKey;->WATCH_FACE:Lcom/szabh/smable3/BleKey;

    sget-object p1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity$syncWatchFace$2;->XIi00iiXO:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/android/mltcode/paycertificationapi/uz0;->O00(Lcom/android/mltcode/paycertificationapi/sz0;Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/szabh/smable3/component/BaseBleConnector;->sendStream$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Ljava/io/File;IILjava/lang/Object;)Z

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity$syncWatchFace$2;->iO:Ljava/io/File;

    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z

    sget-object v0, Lcom/android/mltcode/paycertificationapi/OOX00;->OXO1:Lcom/android/mltcode/paycertificationapi/OOX00;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OOX00;->OXO1(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity$syncWatchFace$2;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "There was a download error\uff1a"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->access$testFailed(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;Ljava/lang/String;)V

    return-void
.end method

.method public handleProgress(I)V
    .locals 0

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity$syncWatchFace$2;->OXO1(Ljava/lang/String;)V

    return-void
.end method
