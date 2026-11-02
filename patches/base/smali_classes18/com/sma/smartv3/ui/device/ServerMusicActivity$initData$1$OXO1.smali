.class public final Lcom/sma/smartv3/ui/device/ServerMusicActivity$initData$1$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/jc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/ServerMusicActivity$initData$1;-><init>(Lcom/sma/smartv3/ui/device/ServerMusicActivity;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/jc<",
        "Lcom/sma/smartv3/model/ServerOSSMusicItem;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/ServerMusicActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity$initData$1$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/ServerMusicActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final IiI10X(Lcom/sma/smartv3/ui/device/ServerMusicActivity;Lcom/sma/smartv3/model/ServerOSSMusicItem;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/ServerOSSMusicItem;->getTitle()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->access$setMCurDir$p(Lcom/sma/smartv3/ui/device/ServerMusicActivity;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->upMusicData()V

    return-void
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/device/ServerMusicActivity;Lcom/sma/smartv3/model/ServerOSSMusicItem;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/ServerMusicActivity$initData$1$OXO1;->IiI10X(Lcom/sma/smartv3/ui/device/ServerMusicActivity;Lcom/sma/smartv3/model/ServerOSSMusicItem;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public O00(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/ServerOSSMusicItem;I)V
    .locals 2

    const-string p3, "holder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "mServerOSSMusicItem"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0a05eb

    invoke-virtual {p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    const v0, 0x7f0a05ea

    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/sma/smartv3/model/ServerOSSMusicItem;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/16 p3, 0x8

    invoke-virtual {v0, p3}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    iget-object p3, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity$initData$1$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/ServerMusicActivity;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/v34;

    invoke-direct {v0, p3, p2}, Lcom/android/mltcode/paycertificationapi/v34;-><init>(Lcom/sma/smartv3/ui/device/ServerMusicActivity;Lcom/sma/smartv3/model/ServerOSSMusicItem;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public bridge synthetic OXO1(Ljava/lang/Object;I)Z
    .locals 0

    check-cast p1, Lcom/sma/smartv3/model/ServerOSSMusicItem;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/ServerMusicActivity$initData$1$OXO1;->XOO0ii0(Lcom/sma/smartv3/model/ServerOSSMusicItem;I)Z

    move-result p1

    return p1
.end method

.method public XIi00iiXO()I
    .locals 1

    const v0, 0x7f0d0f28

    return v0
.end method

.method public XOO0ii0(Lcom/sma/smartv3/model/ServerOSSMusicItem;I)Z
    .locals 1

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/ServerOSSMusicItem;->getIsdir()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    return v0

    :cond_0
    return p2
.end method

.method public bridge synthetic iO(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    check-cast p2, Lcom/sma/smartv3/model/ServerOSSMusicItem;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/ServerMusicActivity$initData$1$OXO1;->O00(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/ServerOSSMusicItem;I)V

    return-void
.end method
