.class public final Lcom/sma/smartv3/ui/device/ServerMusicActivity$initData$1;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/ServerMusicActivity;->initData(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter<",
        "Lcom/sma/smartv3/model/ServerOSSMusicItem;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/ServerMusicActivity;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/device/ServerMusicActivity;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/ServerOSSMusicItem;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    new-instance p2, Lcom/sma/smartv3/ui/device/ServerMusicActivity$initData$1$OXO1;

    invoke-direct {p2, p1}, Lcom/sma/smartv3/ui/device/ServerMusicActivity$initData$1$OXO1;-><init>(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->addItemViewDelegate(ILcom/android/mltcode/paycertificationapi/jc;)Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    new-instance p2, Lcom/sma/smartv3/ui/device/ServerMusicActivity$initData$1$XIi00iiXO;

    invoke-direct {p2, p1}, Lcom/sma/smartv3/ui/device/ServerMusicActivity$initData$1$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->addItemViewDelegate(ILcom/android/mltcode/paycertificationapi/jc;)Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    return-void
.end method
