.class public final Lcom/sma/smartv3/ui/device/AlbumActivity;
.super Lcom/bestmafen/androidbase/recycler/BaseRecyclerActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/recycler/BaseRecyclerActivity<",
        "Landroid/net/Uri;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAlbumActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlbumActivity.kt\ncom/sma/smartv3/ui/device/AlbumActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n87#2,7:59\n94#2,3:67\n70#2,7:70\n97#2:77\n1#3:66\n*S KotlinDebug\n*F\n+ 1 AlbumActivity.kt\ncom/sma/smartv3/ui/device/AlbumActivity\n*L\n40#1:59,7\n40#1:67,3\n40#1:70,7\n40#1:77\n40#1:66\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAlbumActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlbumActivity.kt\ncom/sma/smartv3/ui/device/AlbumActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n87#2,7:59\n94#2,3:67\n70#2,7:70\n97#2:77\n1#3:66\n*S KotlinDebug\n*F\n+ 1 AlbumActivity.kt\ncom/sma/smartv3/ui/device/AlbumActivity\n*L\n40#1:59,7\n40#1:67,3\n40#1:70,7\n40#1:77\n40#1:66\n*E\n"
    }
.end annotation


# instance fields
.field private final mItemWidth:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/recycler/BaseRecyclerActivity;-><init>()V

    invoke-static {}, Lcom/blankj/utilcode/util/ScreenUtils;->getAppScreenWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x3

    iput v0, p0, Lcom/sma/smartv3/ui/device/AlbumActivity;->mItemWidth:I

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/AlbumActivity;ILandroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/AlbumActivity;->initItem$lambda$0$0(Lcom/sma/smartv3/ui/device/AlbumActivity;ILandroid/view/View;)V

    return-void
.end method

.method private static final initItem$lambda$0$0(Lcom/sma/smartv3/ui/device/AlbumActivity;ILandroid/view/View;)V
    .locals 2

    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    const-string v0, "mArg0"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mArg1"

    invoke-virtual {p2, v0, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "mArg2"

    invoke-virtual {p2, p1, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p1, "mArg3"

    invoke-virtual {p2, p1, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/device/GalleryActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initItem(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Landroid/net/Uri;I)V
    .locals 1
    .param p1    # Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Landroid/net/Uri;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a05fc

    .line 2
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    .line 3
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget v0, p0, Lcom/sma/smartv3/ui/device/AlbumActivity;->mItemWidth:I

    invoke-static {p1, v0, v0}, Lcom/angcyo/dsladapter/LibExKt;->i100IXOX(Landroid/view/View;II)V

    .line 4
    new-instance v0, Lcom/android/mltcode/paycertificationapi/XI0OI;

    invoke-direct {v0, p0, p3}, Lcom/android/mltcode/paycertificationapi/XI0OI;-><init>(Lcom/sma/smartv3/ui/device/AlbumActivity;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 5
    invoke-static {p0}, Lcom/bumptech/glide/Glide;->with(Landroidx/fragment/app/FragmentActivity;)Lcom/bumptech/glide/RequestManager;

    move-result-object p3

    .line 6
    invoke-virtual {p3, p2}, Lcom/bumptech/glide/RequestManager;->load(Landroid/net/Uri;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p2

    const/16 p3, 0x64

    .line 7
    invoke-virtual {p2, p3, p3}, Lcom/bumptech/glide/request/BaseRequestOptions;->override(II)Lcom/bumptech/glide/request/BaseRequestOptions;

    move-result-object p2

    check-cast p2, Lcom/bumptech/glide/RequestBuilder;

    .line 8
    invoke-virtual {p2, p1}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void
.end method

.method public bridge synthetic initItem(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Landroid/net/Uri;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/AlbumActivity;->initItem(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Landroid/net/Uri;I)V

    return-void
.end method

.method public initList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/iO0O1OIIi;->OXO1()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public initView()V
    .locals 4

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseRecyclerActivity;->initView()V

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f14010b

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseRecyclerActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v2

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    return-void
.end method

.method public itemLayoutId()I
    .locals 1

    const v0, 0x7f0d0efd

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d002e

    return v0
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method
