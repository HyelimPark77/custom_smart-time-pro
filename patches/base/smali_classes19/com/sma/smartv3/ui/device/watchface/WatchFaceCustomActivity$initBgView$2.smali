.class public final Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$initBgView$2;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;->initBgView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;ILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$initBgView$2;->this$0:Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;

    invoke-direct {p0, p1, p2, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;ILandroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$initBgView$2;->convert$lambda$1(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;ILandroid/view/View;)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;ILandroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$initBgView$2;->convert$lambda$0$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;ILandroid/view/View;)V

    return-void
.end method

.method private static final convert$lambda$0$0(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;ILandroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;->access$showRvBg(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;I)V

    return-void
.end method

.method private static final convert$lambda$1(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;ILandroid/view/View;)V
    .locals 1

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;->access$getMBgFiles$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    const/4 p1, 0x1

    const/4 p2, 0x0

    const/4 v0, 0x0

    invoke-static {p0, v0, p1, p2}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;->showRvBg$default(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;IILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$initBgView$2;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/String;I)V

    return-void
.end method

.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/String;I)V
    .locals 3

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "path"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a05fc

    .line 2
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/ImageViewRound;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$initBgView$2;->this$0:Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;

    .line 3
    invoke-static {p2}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 4
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroidx/appcompat/widget/AppCompatImageView;->setImageURI(Landroid/net/Uri;)V

    .line 5
    :cond_0
    new-instance p2, Lcom/android/mltcode/paycertificationapi/sn6;

    invoke-direct {p2, v1, p3}, Lcom/android/mltcode/paycertificationapi/sn6;-><init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;I)V

    invoke-virtual {v0, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6
    invoke-static {v1}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;->access$getSelectedIndex$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;)I

    move-result p2

    if-ne p2, p3, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {v0, p2}, Lcom/sma/smartv3/view/ImageViewRound;->showSelected(Z)V

    :cond_2
    const p2, 0x7f0a066e

    .line 7
    invoke-virtual {p1, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$initBgView$2;->this$0:Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/tn6;

    invoke-direct {v0, p2, p3}, Lcom/android/mltcode/paycertificationapi/tn6;-><init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
