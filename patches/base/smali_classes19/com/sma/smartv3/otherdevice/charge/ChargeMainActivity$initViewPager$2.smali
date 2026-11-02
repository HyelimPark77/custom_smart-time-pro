.class public final Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$initViewPager$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;->initViewPager()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$initViewPager$2;->this$0:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    return-void
.end method

.method public onPageSelected(I)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$initViewPager$2;->this$0:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;

    if-nez p1, :cond_0

    sget-object p1, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$DeviceType;->CHARGE:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$DeviceType;

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$DeviceType;->EARPHONE:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$DeviceType;

    :goto_0
    invoke-static {v0, p1}, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;->access$setMCurDeviceType$p(Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$DeviceType;)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$initViewPager$2;->this$0:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;

    invoke-static {p1}, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;->access$getMCurDeviceType$p(Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;)Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$DeviceType;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;->access$showCurDeviceView(Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$DeviceType;)V

    return-void
.end method
