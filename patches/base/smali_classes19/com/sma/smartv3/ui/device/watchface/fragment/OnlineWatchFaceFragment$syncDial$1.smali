.class public final Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment$syncDial$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/androidnetworklib/method/HttpProgressCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment;->syncDial(IIILcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/WatchFaceCategoryV2;I)V
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
.field public final synthetic IiI10X:Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment;

.field public final synthetic O00:Lcom/sma/smartv3/view/ProgressButton;

.field public final synthetic OXO1:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

.field public final synthetic XIi00iiXO:Ljava/io/File;

.field public final synthetic XO0O10:Ljava/io/File;

.field public final synthetic iO:I


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/model/WatchFaceCategoryV2;Ljava/io/File;ILjava/io/File;Lcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment$syncDial$1;->OXO1:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment$syncDial$1;->XIi00iiXO:Ljava/io/File;

    iput p3, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment$syncDial$1;->iO:I

    iput-object p4, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment$syncDial$1;->XO0O10:Ljava/io/File;

    iput-object p5, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment$syncDial$1;->O00:Lcom/sma/smartv3/view/ProgressButton;

    iput-object p6, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment$syncDial$1;->IiI10X:Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 7

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "syncDial -> dial try get from net"

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v1, Lcom/sma/smartv3/biz/StatManager;->OXO1:Lcom/sma/smartv3/biz/StatManager;

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment$syncDial$1;->OXO1:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getBinUrl()Ljava/lang/String;

    move-result-object v2

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment$syncDial$1;->XIi00iiXO:Ljava/io/File;

    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->getLength(Ljava/io/File;)J

    move-result-wide v3

    iget v5, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment$syncDial$1;->iO:I

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment$syncDial$1;->OXO1:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getId()I

    move-result v6

    invoke-virtual/range {v1 .. v6}, Lcom/sma/smartv3/biz/StatManager;->XO0O10(Ljava/lang/String;JII)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment$syncDial$1;->XO0O10:Ljava/io/File;

    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/io/File;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment$syncDial$1;->XO0O10:Ljava/io/File;

    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->createOrExistsFile(Ljava/io/File;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment$syncDial$1;->XO0O10:Ljava/io/File;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment$syncDial$1;->OXO1:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getPreviewUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1, v0}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromString(Ljava/io/File;Ljava/lang/String;Z)Z

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment$syncDial$1;->O00:Lcom/sma/smartv3/view/ProgressButton;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const v3, 0x7f1412fd

    invoke-static {p1, v3, v0, v1, v2}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment$syncDial$1;->IiI10X:Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment;->access$sendDial(Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment;)V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 4

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment$syncDial$1;->XIi00iiXO:Ljava/io/File;

    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment$syncDial$1;->XO0O10:Ljava/io/File;

    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment$syncDial$1;->IiI10X:Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment;

    sget-object v0, Lcom/sma/smartv3/model/SyncStatus;->FAILED:Lcom/sma/smartv3/model/SyncStatus;

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment;->access$setMCurSyncStatus$p(Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment;Lcom/sma/smartv3/model/SyncStatus;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment$syncDial$1;->O00:Lcom/sma/smartv3/view/ProgressButton;

    const/4 v0, 0x2

    const/4 v1, 0x0

    const v2, 0x7f1412f9

    const/4 v3, 0x0

    invoke-static {p1, v2, v3, v0, v1}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/OOX00;->OXO1:Lcom/android/mltcode/paycertificationapi/OOX00;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/OOX00;->OXO1(I)Ljava/lang/String;

    move-result-object p1

    new-array v0, v3, [Ljava/lang/Object;

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

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment$syncDial$1;->OXO1(Ljava/lang/String;)V

    return-void
.end method
