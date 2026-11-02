.class public final Lcom/sma/smartv3/ui/status/BloodGlucose2Activity$showData$1;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->showData(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBloodGlucose2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodGlucose2Activity.kt\ncom/sma/smartv3/ui/status/BloodGlucose2Activity$showData$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,287:1\n1#2:288\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBloodGlucose2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodGlucose2Activity.kt\ncom/sma/smartv3/ui/status/BloodGlucose2Activity$showData$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,287:1\n1#2:288\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $days:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity$showData$1;->this$0:Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;

    iput-object p2, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity$showData$1;->$days:Ljava/util/List;

    const v0, 0x7f0d0ec7

    invoke-direct {p0, p1, v0, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method


# virtual methods
.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;JI)V
    .locals 6

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 3
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    const/4 v2, 0x7

    const/4 v3, 0x1

    .line 4
    invoke-virtual {v0, v2, v3, v1}, Ljava/util/Calendar;->getDisplayName(IILjava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->XIi00iiXO(Ljava/util/Calendar;)I

    move-result v0

    add-int/2addr v0, v3

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    :cond_0
    const v0, 0x7f0a1897

    .line 6
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0a03e0

    .line 7
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity$showData$1;->$days:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v1, v3

    if-ne p4, v1, :cond_1

    .line 8
    iget-object p4, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity$showData$1;->this$0:Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;

    invoke-virtual {p4}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p4

    const v1, 0x7f06006c

    invoke-virtual {p4, v1}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p4

    goto :goto_0

    .line 9
    :cond_1
    iget-object p4, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity$showData$1;->this$0:Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;

    invoke-virtual {p4}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p4

    const v1, 0x7f060760

    invoke-virtual {p4, v1}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p4

    .line 10
    :goto_0
    invoke-virtual {v0, p4}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 11
    iget-object p4, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity$showData$1;->this$0:Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;

    invoke-static {p4}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->access$getMBloodGlucoseList$p(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Ljava/util/List;

    move-result-object p4

    check-cast p4, Ljava/lang/Iterable;

    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :cond_2
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/sma/smartv3/db/entity/BloodGlucose2;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iiIOiX()Ljava/text/SimpleDateFormat;

    move-result-object v2

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMTime()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iiIOiX()Ljava/text/SimpleDateFormat;

    move-result-object v2

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    check-cast v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;

    const/4 p2, 0x0

    const p3, 0x7f0a0669

    if-eqz v0, :cond_4

    .line 12
    invoke-virtual {p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p3

    invoke-virtual {p3, p2}, Landroid/view/View;->setVisibility(I)V

    .line 13
    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMCurrentLevel()I

    move-result p2

    goto :goto_2

    .line 14
    :cond_4
    invoke-virtual {p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p3

    const/16 p4, 0x8

    invoke-virtual {p3, p4}, Landroid/view/View;->setVisibility(I)V

    :goto_2
    const p3, 0x7f0a03df

    .line 15
    invoke-virtual {p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    .line 16
    iget-object p3, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity$showData$1;->this$0:Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;

    invoke-virtual {p3}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    if-eq p2, v3, :cond_8

    const/4 p4, 0x2

    if-eq p2, p4, :cond_7

    const/4 p4, 0x3

    if-eq p2, p4, :cond_6

    const/4 p4, 0x4

    if-eq p2, p4, :cond_5

    const p2, 0x7f060067

    goto :goto_3

    :cond_5
    const p2, 0x7f06006b

    goto :goto_3

    :cond_6
    const p2, 0x7f06006a

    goto :goto_3

    :cond_7
    const p2, 0x7f060069

    goto :goto_3

    :cond_8
    const p2, 0x7f060068

    :goto_3
    invoke-virtual {p3, p2}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p2

    .line 17
    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 2

    .line 1
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1, p3}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity$showData$1;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;JI)V

    return-void
.end method
