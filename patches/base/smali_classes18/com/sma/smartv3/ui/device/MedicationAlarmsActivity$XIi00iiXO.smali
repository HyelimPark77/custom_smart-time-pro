.class public final Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/baoyz/swipemenulistview/SwipeMenuListView$XO0O10;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/baoyz/swipemenulistview/SwipeMenuListView;


# direct methods
.method public constructor <init>(Lcom/baoyz/swipemenulistview/SwipeMenuListView;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity$XIi00iiXO;->OXO1:Lcom/baoyz/swipemenulistview/SwipeMenuListView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(I)V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity$XIi00iiXO;->OXO1:Lcom/baoyz/swipemenulistview/SwipeMenuListView;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v1

    sub-int/2addr p1, v1

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    instance-of v0, p1, Lcom/baoyz/swipemenulistview/SwipeMenuLayout;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/baoyz/swipemenulistview/SwipeMenuLayout;

    const v0, 0x7f081784

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    :cond_0
    return-void
.end method

.method public XIi00iiXO(I)V
    .locals 0

    return-void
.end method
