.class public final Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$syncDial$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/androidnetworklib/method/HttpProgressCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->syncDial(IIILcom/sma/smartv3/view/ProgressButtonV2;Ljava/lang/String;Ljava/lang/String;I)V
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
.field public final synthetic I0IIOi:Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;

.field public final synthetic IiI10X:Ljava/lang/String;

.field public final synthetic O00:Ljava/io/File;

.field public final synthetic OXO1:Ljava/lang/String;

.field public final synthetic XIi00iiXO:Ljava/io/File;

.field public final synthetic XO0O10:I

.field public final synthetic XOO0ii0:Lcom/sma/smartv3/view/ProgressButtonV2;

.field public final synthetic iO:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/io/File;IILjava/io/File;Ljava/lang/String;Lcom/sma/smartv3/view/ProgressButtonV2;Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$syncDial$1;->OXO1:Ljava/lang/String;

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$syncDial$1;->XIi00iiXO:Ljava/io/File;

    iput p3, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$syncDial$1;->iO:I

    iput p4, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$syncDial$1;->XO0O10:I

    iput-object p5, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$syncDial$1;->O00:Ljava/io/File;

    iput-object p6, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$syncDial$1;->IiI10X:Ljava/lang/String;

    iput-object p7, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$syncDial$1;->XOO0ii0:Lcom/sma/smartv3/view/ProgressButtonV2;

    iput-object p8, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$syncDial$1;->I0IIOi:Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 11

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "syncDial -> dial try get from net"

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v1, Lcom/sma/smartv3/biz/StatManager;->OXO1:Lcom/sma/smartv3/biz/StatManager;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$syncDial$1;->OXO1:Ljava/lang/String;

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$syncDial$1;->XIi00iiXO:Ljava/io/File;

    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->getLength(Ljava/io/File;)J

    move-result-wide v3

    iget v5, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$syncDial$1;->iO:I

    iget v6, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$syncDial$1;->XO0O10:I

    invoke-virtual/range {v1 .. v6}, Lcom/sma/smartv3/biz/StatManager;->XO0O10(Ljava/lang/String;JII)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$syncDial$1;->O00:Ljava/io/File;

    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/io/File;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$syncDial$1;->O00:Ljava/io/File;

    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->createOrExistsFile(Ljava/io/File;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$syncDial$1;->O00:Ljava/io/File;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$syncDial$1;->IiI10X:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromString(Ljava/io/File;Ljava/lang/String;Z)Z

    :cond_0
    iget-object v2, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$syncDial$1;->XOO0ii0:Lcom/sma/smartv3/view/ProgressButtonV2;

    const/16 v9, 0x3e

    const/4 v10, 0x0

    const v3, 0x7f1412fd

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v10}, Lcom/sma/smartv3/view/ProgressButtonV2;->IiI10X(Lcom/sma/smartv3/view/ProgressButtonV2;IZIZILjava/lang/String;ILjava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$syncDial$1;->I0IIOi:Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$syncDial$1;->XIi00iiXO:Ljava/io/File;

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->access$sendDial(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;Ljava/io/File;)V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 10

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$syncDial$1;->XIi00iiXO:Ljava/io/File;

    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$syncDial$1;->O00:Ljava/io/File;

    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$syncDial$1;->I0IIOi:Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;

    sget-object v0, Lcom/sma/smartv3/model/SyncStatus;->FAILED:Lcom/sma/smartv3/model/SyncStatus;

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->access$setMCurSyncStatus$p(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;Lcom/sma/smartv3/model/SyncStatus;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$syncDial$1;->XOO0ii0:Lcom/sma/smartv3/view/ProgressButtonV2;

    const/16 v8, 0x3e

    const/4 v9, 0x0

    const v2, 0x7f1412f9

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lcom/sma/smartv3/view/ProgressButtonV2;->IiI10X(Lcom/sma/smartv3/view/ProgressButtonV2;IZIZILjava/lang/String;ILjava/lang/Object;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/OOX00;->OXO1:Lcom/android/mltcode/paycertificationapi/OOX00;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/OOX00;->OXO1(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public handleProgress(I)V
    .locals 0

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$syncDial$1;->OXO1(Ljava/lang/String;)V

    return-void
.end method
