.class public final Lcom/sma/smartv3/ui/device/QrcodeTypeInfosActivity;
.super Lcom/bestmafen/androidbase/list/BaseListActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/list/BaseListActivity<",
        "Lcom/sma/smartv3/model/QrcodeTypeInfo;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQrcodeTypeInfosActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QrcodeTypeInfosActivity.kt\ncom/sma/smartv3/ui/device/QrcodeTypeInfosActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n87#2,7:48\n94#2,3:56\n70#2,7:59\n97#2:66\n1#3:55\n*S KotlinDebug\n*F\n+ 1 QrcodeTypeInfosActivity.kt\ncom/sma/smartv3/ui/device/QrcodeTypeInfosActivity\n*L\n31#1:48,7\n31#1:56,3\n31#1:59,7\n31#1:66\n31#1:55\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nQrcodeTypeInfosActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QrcodeTypeInfosActivity.kt\ncom/sma/smartv3/ui/device/QrcodeTypeInfosActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n87#2,7:48\n94#2,3:56\n70#2,7:59\n97#2:66\n1#3:55\n*S KotlinDebug\n*F\n+ 1 QrcodeTypeInfosActivity.kt\ncom/sma/smartv3/ui/device/QrcodeTypeInfosActivity\n*L\n31#1:48,7\n31#1:56,3\n31#1:59,7\n31#1:66\n31#1:55\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;-><init>()V

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/QrcodeTypeInfosActivity;Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/device/QrcodeTypeInfosActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/device/QrcodeTypeInfosActivity;Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    return-void
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/device/QrcodeTypeInfosActivity;Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/io/Serializable;

    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    const-string p3, "mArg0"

    const/4 p4, 0x0

    invoke-virtual {p2, p3, p4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p3, "mArg2"

    invoke-virtual {p2, p3, p4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p3, "mArg3"

    invoke-virtual {p2, p3, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    const-class p3, Lcom/sma/smartv3/ui/device/QrcodeSyncActivity;

    invoke-direct {p1, p0, p3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

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

.method public initItem(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/sma/smartv3/model/QrcodeTypeInfo;I)V
    .locals 1
    .param p1    # Lcom/android/mltcode/paycertificationapi/ug6;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/model/QrcodeTypeInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string p3, "holder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0a05fc

    .line 2
    invoke-virtual {p1, p3}, Lcom/android/mltcode/paycertificationapi/ug6;->O00(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/ImageView;

    invoke-virtual {p2}, Lcom/sma/smartv3/model/QrcodeTypeInfo;->getIconResId()I

    move-result v0

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    const p3, 0x7f0a0ca3

    .line 3
    invoke-virtual {p1, p3}, Lcom/android/mltcode/paycertificationapi/ug6;->O00(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/sma/smartv3/model/QrcodeTypeInfo;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public bridge synthetic initItem(Lcom/android/mltcode/paycertificationapi/ug6;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/sma/smartv3/model/QrcodeTypeInfo;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/QrcodeTypeInfosActivity;->initItem(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/sma/smartv3/model/QrcodeTypeInfo;I)V

    return-void
.end method

.method public initList()Ljava/util/List;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/QrcodeTypeInfo;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v1

    invoke-virtual {v0, p0, v1}, Lcom/android/mltcode/paycertificationapi/q62;->IOX1(Landroid/content/Context;I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public initView()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->initView()V

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const v1, 0x7f141160

    goto :goto_0

    :cond_0
    const v1, 0x7f140fcc

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListView()Landroid/widget/ListView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/qa2;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/qa2;-><init>(Lcom/sma/smartv3/ui/device/QrcodeTypeInfosActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    return-void
.end method

.method public itemLayoutId()I
    .locals 1

    const v0, 0x7f0d0ecf

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00eb

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
