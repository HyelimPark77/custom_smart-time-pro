.class public final Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment$initView$3;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;->initView()V
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

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPointerElementFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerElementFragment.kt\ncom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment$initView$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,120:1\n1878#2,3:121\n*S KotlinDebug\n*F\n+ 1 PointerElementFragment.kt\ncom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment$initView$3\n*L\n63#1:121,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPointerElementFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerElementFragment.kt\ncom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment$initView$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,120:1\n1878#2,3:121\n*S KotlinDebug\n*F\n+ 1 PointerElementFragment.kt\ncom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment$initView$3\n*L\n63#1:121,3\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;Landroidx/fragment/app/FragmentActivity;ILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;",
            "Landroidx/fragment/app/FragmentActivity;",
            "I",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/ResourcesIdInfo;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment$initView$3;->this$0:Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;

    invoke-direct {p0, p2, p3, p4}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment$initView$3;Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;ILandroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment$initView$3;->convert$lambda$0(Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment$initView$3;Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;ILandroid/view/View;)V

    return-void
.end method

.method private static final convert$lambda$0(Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment$initView$3;Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;ILandroid/view/View;)V
    .locals 4

    iget-object p3, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->mDatas:Ljava/util/List;

    const-string v0, "mDatas"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Ljava/lang/Iterable;

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    if-gez v1, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_0
    check-cast v2, Lcom/sma/smartv3/model/ResourcesIdInfo;

    if-ne v1, p2, :cond_1

    invoke-virtual {v2}, Lcom/sma/smartv3/model/ResourcesIdInfo;->isSelect()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-virtual {v2, v1}, Lcom/sma/smartv3/model/ResourcesIdInfo;->setSelect(Z)V

    goto :goto_1

    :cond_1
    invoke-virtual {v2, v0}, Lcom/sma/smartv3/model/ResourcesIdInfo;->setSelect(Z)V

    :goto_1
    move v1, v3

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;->getCallback()Lcom/android/mltcode/paycertificationapi/az1;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->mDatas:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sma/smartv3/model/ResourcesIdInfo;

    invoke-virtual {p2}, Lcom/sma/smartv3/model/ResourcesIdInfo;->isSelect()Z

    move-result p2

    invoke-interface {p1, p3, p2}, Lcom/android/mltcode/paycertificationapi/az1;->OXO1(Ljava/lang/Object;Z)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method


# virtual methods
.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/ResourcesIdInfo;I)V
    .locals 2

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resourcesIdInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a0939

    .line 2
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 3
    invoke-virtual {p2}, Lcom/sma/smartv3/model/ResourcesIdInfo;->getResId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    const v0, 0x7f0a0a12

    .line 4
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 5
    invoke-virtual {p2}, Lcom/sma/smartv3/model/ResourcesIdInfo;->isSelect()Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    const/16 p2, 0x8

    .line 6
    :goto_0
    invoke-virtual {v0, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    const p2, 0x7f0a09c1

    .line 7
    invoke-virtual {p1, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment$initView$3;->this$0:Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/dz1;

    invoke-direct {v0, p0, p2, p3}, Lcom/android/mltcode/paycertificationapi/dz1;-><init>(Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment$initView$3;Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/sma/smartv3/model/ResourcesIdInfo;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment$initView$3;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/ResourcesIdInfo;I)V

    return-void
.end method
