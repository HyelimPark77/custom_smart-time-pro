.class public final Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$initScreensaver$3;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;->initScreensaver()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Lcom/sma/smartv3/model/ResourcesIdInfo;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/ResourcesIdInfo;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$initScreensaver$3;->this$0:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;

    const v0, 0x7f0d0ecb

    invoke-direct {p0, p1, v0, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$initScreensaver$3;Lcom/sma/smartv3/model/ResourcesIdInfo;Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;ILandroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$initScreensaver$3;->convert$lambda$0(Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$initScreensaver$3;Lcom/sma/smartv3/model/ResourcesIdInfo;Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;ILandroid/view/View;)V

    return-void
.end method

.method private static final convert$lambda$0(Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$initScreensaver$3;Lcom/sma/smartv3/model/ResourcesIdInfo;Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;ILandroid/view/View;)V
    .locals 2

    iget-object p4, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->mDatas:Ljava/util/List;

    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/model/ResourcesIdInfo;->setSelect(Z)V

    goto :goto_0

    :cond_0
    const/4 p4, 0x1

    invoke-virtual {p1, p4}, Lcom/sma/smartv3/model/ResourcesIdInfo;->setSelect(Z)V

    invoke-static {p2}, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;->access$getIvScreensaver(Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;)Lcom/sma/smartv3/view/ImageViewRound;

    move-result-object p1

    invoke-static {p2}, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;->access$getMScreensaverPics(Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;)Ljava/util/List;

    move-result-object p4

    invoke-interface {p4, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/sma/smartv3/model/ResourcesIdInfo;

    invoke-virtual {p3}, Lcom/sma/smartv3/model/ResourcesIdInfo;->getResId()I

    move-result p3

    invoke-virtual {p1, p3}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    invoke-static {p2}, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;->access$syncScreensaver(Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method


# virtual methods
.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/ResourcesIdInfo;I)V
    .locals 3

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resourcesIdInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a0a12

    .line 2
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 3
    invoke-virtual {p2}, Lcom/sma/smartv3/model/ResourcesIdInfo;->isSelect()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    .line 4
    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    const v0, 0x7f0a05fc

    .line 5
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 6
    invoke-virtual {p2}, Lcom/sma/smartv3/model/ResourcesIdInfo;->getResId()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 7
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$initScreensaver$3;->this$0:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O01001;

    invoke-direct {v1, p0, p2, v0, p3}, Lcom/android/mltcode/paycertificationapi/O01001;-><init>(Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$initScreensaver$3;Lcom/sma/smartv3/model/ResourcesIdInfo;Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;I)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/sma/smartv3/model/ResourcesIdInfo;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$initScreensaver$3;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/ResourcesIdInfo;I)V

    return-void
.end method
