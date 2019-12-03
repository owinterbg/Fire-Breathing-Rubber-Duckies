from bs4 import BeautifulSoup
import requests
import csv
import os
import os.path
from os import path
import time


def bSoup(page, tag, budget, type):
    soup = BeautifulSoup(page.content, 'html.parser')
    title = soup.find('h1', {"class": "pageTitle"}).text
    price = soup.find('td', {"class": "td__finalPrice"}).text

    if(tag == "RAM"):
        print(budget)
    print('\t' + type + ',' + tag + ',' + title + ',' + price)
    if(tag == "HDD"):
        print("")

    csvData = [[budget, type, tag, title, price]]



    with open('data.csv', 'a') as csvFile:
        writer = csv.writer(csvFile)
        writer.writerows(csvData)
    csvFile.close()


def RAM_gaming(budget, type):
    tag  = "RAM"
    if(budget == 1):    #Corsair Vengeance 1x8GB DDR4-3000
        page = requests.get("https://pcpartpicker.com/product/TRF48d/corsair-vengeance-lpx-8gb-1-x-8gb-ddr4-3000-memory-cmk8gx4m1d3000c16")
    elif(budget == 2):  #Corsair Vengeance 1x8GB DDR4-3000
        page = requests.get("https://pcpartpicker.com/product/TRF48d/corsair-vengeance-lpx-8gb-1-x-8gb-ddr4-3000-memory-cmk8gx4m1d3000c16")
    elif(budget == 3):  #Corsair Vengeance 2x8GB DDR4-3000
        page = requests.get("https://pcpartpicker.com/product/MYH48d/corsair-memory-cmk16gx4m2b3000c15")
    elif(budget == 4):  #Corsair Vengeance 2x8GB DDR4-3000
        page = requests.get("https://pcpartpicker.com/product/MYH48d/corsair-memory-cmk16gx4m2b3000c15")
    elif(budget == 5):  #Corsair Vengeance 2x8GB DDR4-3000
        page = requests.get("https://pcpartpicker.com/product/MYH48d/corsair-memory-cmk16gx4m2b3000c15")
    elif(budget == 6):  #Corsair Vengeance 2x8GB DDR4-3000
        page = requests.get("https://pcpartpicker.com/product/MYH48d/corsair-memory-cmk16gx4m2b3000c15")
    elif(budget == 7):  #Corsair Vengeance 2x8GB DDR4-3000
        page = requests.get("https://pcpartpicker.com/product/MYH48d/corsair-memory-cmk16gx4m2b3000c15")
    elif(budget == 8):  #Corsair Vengeance 2x8GB DDR4-3000
        page = requests.get("https://pcpartpicker.com/product/MYH48d/corsair-memory-cmk16gx4m2b3000c15")
    elif(budget == 9):  #Corsair Vengeance 4x8GB DDR4-3000
        page = requests.get("https://pcpartpicker.com/product/Ckw7YJ/corsair-vengeance-lpx-32gb-4-x-8gb-ddr4-3000-memory-cmk32gx4m4d3000c16")
    elif(budget == 10): #Corsair Vengeance 4x8GB DDR4-3000
        page = requests.get("https://pcpartpicker.com/product/Ckw7YJ/corsair-vengeance-lpx-32gb-4-x-8gb-ddr4-3000-memory-cmk32gx4m4d3000c16")
    bSoup(page, tag, budget, type)

def RAM_workstation(budget, type):
    tag  = "RAM"
    if(budget == 1):
        page = requests.get("https://pcpartpicker.com/product/MYH48d/corsair-memory-cmk16gx4m2b3000c15")
    elif(budget == 2):
        page = requests.get("https://pcpartpicker.com/product/MYH48d/corsair-memory-cmk16gx4m2b3000c15")
    elif(budget == 3):
        page = requests.get("https://pcpartpicker.com/product/Ckw7YJ/corsair-vengeance-lpx-32gb-4-x-8gb-ddr4-3000-memory-cmk32gx4m4d3000c16")
    elif(budget == 4):
        page = requests.get("https://pcpartpicker.com/product/Ckw7YJ/corsair-vengeance-lpx-32gb-4-x-8gb-ddr4-3000-memory-cmk32gx4m4d3000c16")
    elif(budget == 5):
        page = requests.get("https://pcpartpicker.com/product/Ckw7YJ/corsair-vengeance-lpx-32gb-4-x-8gb-ddr4-3000-memory-cmk32gx4m4d3000c16")
    elif(budget == 6):
        page = requests.get("https://pcpartpicker.com/product/Ckw7YJ/corsair-vengeance-lpx-32gb-4-x-8gb-ddr4-3000-memory-cmk32gx4m4d3000c16")
    elif(budget == 7):
        page = requests.get("https://pcpartpicker.com/product/NjWfrH/corsair-vengeance-lpx-64gb-4-x-16gb-ddr4-3000-memory-cmk64gx4m4d3000c16")
    elif(budget == 8):
        page = requests.get("https://pcpartpicker.com/product/NjWfrH/corsair-vengeance-lpx-64gb-4-x-16gb-ddr4-3000-memory-cmk64gx4m4d3000c16")
    elif(budget == 9):
        page = requests.get("https://pcpartpicker.com/product/NjWfrH/corsair-vengeance-lpx-64gb-4-x-16gb-ddr4-3000-memory-cmk64gx4m4d3000c16")
    elif(budget == 10):
        page = requests.get("https://pcpartpicker.com/product/NjWfrH/corsair-vengeance-lpx-64gb-4-x-16gb-ddr4-3000-memory-cmk64gx4m4d3000c16")
    bSoup(page, tag, budget, type)

def CPU_gaming(budget, type):
    tag  = "CPU"
    if(budget == 1):    #i3 9100f
        page = requests.get("https://pcpartpicker.com/product/YTbwrH/intel-core-i3-9100f-36-ghz-quad-core-processor-bx80684i39100f")
    elif(budget == 2):  #i3 9100
        page = requests.get("https://pcpartpicker.com/product/NfKcCJ/intel-core-i3-9100-36-ghz-quad-core-processor-bx80684i39100")
    elif(budget == 3):  #i5 9400f
        page = requests.get("https://pcpartpicker.com/product/T47v6h/intel-core-i5-9400f-29-ghz-6-core-processor-bx80684i59400f")
    elif(budget == 4):  #i5 9600k
        page = requests.get("https://pcpartpicker.com/product/28qhP6/intel-core-i5-9600k-37ghz-6-core-processor-bx80684i59600k")
    elif(budget == 5):  #i5 9400
        page = requests.get("https://pcpartpicker.com/product/V4RzK8/intel-core-i5-9400-29-ghz-6-core-processor-bx80684i59400")
    elif(budget == 6):  #i7 9700f
        page = requests.get("https://pcpartpicker.com/product/W4848d/intel-core-i7-9700f-3-ghz-8-core-processor-bx80684i79700f")
    elif(budget == 7):  #i7 9700
        page = requests.get("https://pcpartpicker.com/product/L6vbt6/intel-core-i7-9700-3-ghz-8-core-processor-bx80684i79700")
    elif(budget == 8):  #i7 9700k
        page = requests.get("https://pcpartpicker.com/product/WtyV3C/intel-core-i7-9700k-36ghz-8-core-processor-bx80684i79700k")
    elif(budget == 9):  #i9 9900k
        page = requests.get("https://pcpartpicker.com/product/jHZFf7/intel-core-i9-9900k-36ghz-8-core-processor-bx80684i99900k")
    elif(budget == 10): #i9 9900ks
        page = requests.get("https://pcpartpicker.com/product/9mCFf7/intel-core-i9-9900ks-4-ghz-8-core-processor-bx80684i99900ks")
    bSoup(page, tag, budget, type)

def CPU_workstation(budget, type):
    tag  = "CPU"
    if(budget == 1):    #Ryzen 3 2200G
        page = requests.get("https://pcpartpicker.com/product/RkJtt6/amd-ryzen-3-2200g-35ghz-quad-core-processor-yd2200c5fbbox")
    elif(budget == 2):  #Ryzen 5 2600
        page = requests.get("https://pcpartpicker.com/product/jLF48d/amd-ryzen-5-2600-34ghz-6-core-processor-yd2600bbafbox")
    elif(budget == 3):  #Ryzen 5 2600X
        page = requests.get("https://pcpartpicker.com/product/6mm323/amd-ryzen-5-2600x-36ghz-6-core-processor-yd260xbcafbox")
    elif(budget == 4):  #Ryzen 7 2700
        page = requests.get("https://pcpartpicker.com/product/WPQG3C/amd-ryzen-7-2700-32ghz-8-core-processor-yd2700bbafbox")
    elif(budget == 5):  #Ryzen 7 2700X
        page = requests.get("https://pcpartpicker.com/product/bddxFT/amd-ryzen-7-2700x-37ghz-8-core-processor-yd270xbgafbox")
    elif(budget == 6):  #Ryzen 5 3600
        page = requests.get("https://pcpartpicker.com/product/9nm323/amd-ryzen-5-3600-36-thz-6-core-processor-100-100000031box")
    elif(budget == 7):  #Ryzen 5 3600X
        page = requests.get("https://pcpartpicker.com/product/3WYLrH/amd-ryzen-5-3600x-38-thz-6-core-processor-100-100000022box")
    elif(budget == 8):  #Ryzen 7 3700X
        page = requests.get("https://pcpartpicker.com/product/QKJtt6/amd-ryzen-7-3700x-36-ghz-8-core-processor-100-100000071box")
    elif(budget == 9):  #Ryzen 7 3800X
        page = requests.get("https://pcpartpicker.com/product/qryV3C/amd-ryzen-7-3800x-39-ghz-8-core-processor-100-100000025box")
    elif(budget == 10): #Ryzen 9 3900X
        page = requests.get("https://pcpartpicker.com/product/tLCD4D/amd-ryzen-9-3900x-36-ghz-12-core-processor-100-100000023box")
    bSoup(page, tag, budget, type)

def GraphicsCard(budget, type):
    tag  = "Graphics Card"
    if(budget == 1):
        page = requests.get("https://pcpartpicker.com/product/3JdFf7/msi-radeon-rx-570-8gb-armor-oc-video-card-rx-570-armor-8g-oc")
    elif(budget == 2):
        page = requests.get("https://pcpartpicker.com/product/TTfmP6/msi-radeon-rx-580-8gb-armor-oc-video-card-rx-580-armor-8g-oc")
    elif(budget == 3):
        page = requests.get("https://pcpartpicker.com/product/Z3wkcf/msi-geforce-gtx-1660-super-6-gb-ventus-xs-oc-video-card-gtx-1660-super-ventus-xs-oc")
    elif(budget == 4):
        page = requests.get("https://pcpartpicker.com/product/RGyV3C/msi-geforce-gtx-1660-ti-6-gb-ventus-xs-video-card-gtx-1660-ti-ventus-xs-6g-oc")
    elif(budget == 5):
        page = requests.get("https://pcpartpicker.com/product/pk6qqs/msi-radeon-rx-5700-8-gb-evoke-oc-video-card-radeon-rx-5700-evoke-oc")
    elif(budget == 6):
        page = requests.get("https://pcpartpicker.com/product/Q7TzK8/msi-radeon-rx-5700-xt-8-gb-evoke-oc-video-card-radeon-rx-5700-xt-evoke-oc")
    elif(budget == 7):
        page = requests.get("https://pcpartpicker.com/product/2WZzK8/msi-geforce-rtx-2060-super-8-gb-ventus-oc-video-card-rtx-2060-super-ventus-oc")
    elif(budget == 8):
        page = requests.get("https://pcpartpicker.com/product/NxrYcf/msi-geforce-rtx-2070-super-8-gb-ventus-oc-video-card-rtx-2070-super-ventus-oc")
    elif(budget == 9):
        page = requests.get("https://pcpartpicker.com/product/xf848d/msi-geforce-rtx-2080-super-8-gb-ventus-oc-video-card-rtx-2080-super-ventus-oc")
    elif(budget == 10):
        page = requests.get("https://pcpartpicker.com/product/ZGYLrH/msi-geforce-rtx-2080-ti-11-gb-ventus-oc-video-card-rtx-2080-ti-ventus-11g-oc")

    bSoup(page, tag, budget, type)

def PowerSupply(budget, type):
    tag  = "Power Supply"
    if(budget == 1):
        page = requests.get("https://pcpartpicker.com/product/xDMwrH/evga-br-450w-80-bronze-certified-atx-power-supply-100-br-0450-k1")
    elif(budget == 2):
        page = requests.get("https://pcpartpicker.com/product/xDMwrH/evga-br-450w-80-bronze-certified-atx-power-supply-100-br-0450-k1")
    elif(budget == 3):
        page = requests.get("https://pcpartpicker.com/product/DmWrxr/evga-bq-600w-80-bronze-certified-semi-modular-atx-power-supply-110-bq-0600-k1")
    elif(budget == 4):
        page = requests.get("https://pcpartpicker.com/product/DmWrxr/evga-bq-600w-80-bronze-certified-semi-modular-atx-power-supply-110-bq-0600-k1")
    elif(budget == 5):
        page = requests.get("https://pcpartpicker.com/product/xLs8TW/evga-bq-750w-80-bronze-certified-semi-modular-atx-power-supply-110-bq-0750-v1")
    elif(budget == 6):
        page = requests.get("https://pcpartpicker.com/product/xLs8TW/evga-bq-750w-80-bronze-certified-semi-modular-atx-power-supply-110-bq-0750-v1")
    elif(budget == 7):
        page = requests.get("https://pcpartpicker.com/product/kGL7YJ/evga-bq-850w-80-bronze-certified-semi-modular-atx-power-supply-110-bq-0850-v1")
    elif(budget == 8):
        page = requests.get("https://pcpartpicker.com/product/kGL7YJ/evga-bq-850w-80-bronze-certified-semi-modular-atx-power-supply-110-bq-0850-v1")
    elif(budget == 9):
        page = requests.get("https://pcpartpicker.com/product/bcTrxr/evga-power-supply-210gq1000")
    elif(budget == 10):
        page = requests.get("https://pcpartpicker.com/product/bcTrxr/evga-power-supply-210gq1000")
    bSoup(page, tag, budget, type)

def Case(budget, type):
    tag  = "Case"
    if(budget == 1):
        page = requests.get("https://pcpartpicker.com/product/g2bwrH/phanteks-eclipse-p300-white-atx-mid-tower-case-ph-ec300ptg_wt")
    elif(budget == 2):
        page = requests.get("https://pcpartpicker.com/product/g2bwrH/phanteks-eclipse-p300-white-atx-mid-tower-case-ph-ec300ptg_wt")
    elif(budget == 3):
        page = requests.get("https://pcpartpicker.com/product/gmJkcf/phanteks-eclipse-p400s-tempered-glass-atx-mid-tower-case-ph-ec416pstg_wt1")
    elif(budget == 4):
        page = requests.get("https://pcpartpicker.com/product/gmJkcf/phanteks-eclipse-p400s-tempered-glass-atx-mid-tower-case-ph-ec416pstg_wt")
    elif(budget == 5):
        page = requests.get("https://pcpartpicker.com/product/gmJkcf/phanteks-eclipse-p400s-tempered-glass-atx-mid-tower-case-ph-ec416pstg_wt")
    elif(budget == 6):
        page = requests.get("https://pcpartpicker.com/product/bnzkcf/phanteks-eclipse-p600s-atx-mid-tower-case-ph-ec600pstg_wt01")
    elif(budget == 7):
        page = requests.get("https://pcpartpicker.com/product/bnzkcf/phanteks-eclipse-p600s-atx-mid-tower-case-ph-ec600pstg_wt01")
    elif(budget == 8):
        page = requests.get("https://pcpartpicker.com/product/bnzkcf/phanteks-eclipse-p600s-atx-mid-tower-case-ph-ec600pstg_wt01")
    elif(budget == 9):
        page = requests.get("https://pcpartpicker.com/product/NBsKHx/phanteks-case-phes813pwt")
    elif(budget == 10):
        page = requests.get("https://pcpartpicker.com/product/NBsKHx/phanteks-case-phes813pwt")
    bSoup(page, tag, budget, type)

def MotherBoard_gaming(budget, type):
    tag  = "Motherboard"
    if(budget == 1):
        page = requests.get("https://pcpartpicker.com/product/M3m323/msi-b360-gaming-plus-atx-lga1151-motherboard-b360-gaming-plus")
    elif(budget == 2):
        page = requests.get("https://pcpartpicker.com/product/M3m323/msi-b360-gaming-plus-atx-lga1151-motherboard-b360-gaming-plus")
    elif(budget == 3):
        page = requests.get("https://pcpartpicker.com/product/M3m323/msi-b360-gaming-plus-atx-lga1151-motherboard-b360-gaming-plus")
    elif(budget == 4):
        page = requests.get("https://pcpartpicker.com/product/QDVD4D/msi-mpg-z390-gaming-plus-atx-lga1151-motherboard-mpg-z390-gaming-plus")
    elif(budget == 5):
        page = requests.get("https://pcpartpicker.com/product/QDVD4D/msi-mpg-z390-gaming-plus-atx-lga1151-motherboard-mpg-z390-gaming-plus")
    elif(budget == 6):
        page = requests.get("https://pcpartpicker.com/product/QDVD4D/msi-mpg-z390-gaming-plus-atx-lga1151-motherboard-mpg-z390-gaming-plus")
    elif(budget == 7):
        page = requests.get("https://pcpartpicker.com/product/QDVD4D/msi-mpg-z390-gaming-plus-atx-lga1151-motherboard-mpg-z390-gaming-plus")
    elif(budget == 8):
        page = requests.get("https://pcpartpicker.com/product/QDVD4D/msi-mpg-z390-gaming-plus-atx-lga1151-motherboard-mpg-z390-gaming-plus")
    elif(budget == 9):
        page = requests.get("https://pcpartpicker.com/product/t8qhP6/msi-mpg-z390-gaming-edge-ac-atx-lga1151-motherboard-mpg-z390-gaming-edge-ac")
    elif(budget == 10):
        page = requests.get("https://pcpartpicker.com/product/t8qhP6/msi-mpg-z390-gaming-edge-ac-atx-lga1151-motherboard-mpg-z390-gaming-edge-ac")
    bSoup(page, tag, budget, type)

def MotherBoard_workstation(budget, type):
    tag  = "Motherboard"
    if(budget == 1):
        page = requests.get("https://pcpartpicker.com/product/wb7v6h/asrock-b450-steel-legend-atx-am4-motherboard-b450-steel-legend")
    elif(budget == 2):
        page = requests.get("https://pcpartpicker.com/product/wb7v6h/asrock-b450-steel-legend-atx-am4-motherboard-b450-steel-legend")
    elif(budget == 3):
        page = requests.get("https://pcpartpicker.com/product/wb7v6h/asrock-b450-steel-legend-atx-am4-motherboard-b450-steel-legend")
    elif(budget == 4):
        page = requests.get("https://pcpartpicker.com/product/RJxbt6/asrock-x570-phantom-gaming-4-atx-am4-motherboard-x570-phantom-gaming-4")
    elif(budget == 5):
        page = requests.get("https://pcpartpicker.com/product/RJxbt6/asrock-x570-phantom-gaming-4-atx-am4-motherboard-x570-phantom-gaming-4")
    elif(budget == 6):
        page = requests.get("https://pcpartpicker.com/product/RJxbt6/asrock-x570-phantom-gaming-4-atx-am4-motherboard-x570-phantom-gaming-4")
    elif(budget == 7):
        page = requests.get("https://pcpartpicker.com/product/RJxbt6/asrock-x570-phantom-gaming-4-atx-am4-motherboard-x570-phantom-gaming-4")
    elif(budget == 8):
        page = requests.get("https://pcpartpicker.com/product/RJxbt6/asrock-x570-phantom-gaming-4-atx-am4-motherboard-x570-phantom-gaming-4")
    elif(budget == 9):
        page = requests.get("https://pcpartpicker.com/product/Ft6qqs/asrock-x570-steel-legend-atx-am4-motherboard-x570-steel-legend")
    elif(budget == 10):
        page = requests.get("https://pcpartpicker.com/product/Ft6qqs/asrock-x570-steel-legend-atx-am4-motherboard-x570-steel-legend")
    bSoup(page, tag, budget, type)

def SSD(budget, type):
    tag = "SSD"
    if(budget == 1):
        page = requests.get("https://pcpartpicker.com/product/2FDzK8/kingston-a400-120gb-25-solid-state-drive-sa400s37120g")
    elif(budget == 2):
        page = requests.get("https://pcpartpicker.com/product/2FDzK8/kingston-a400-120gb-25-solid-state-drive-sa400s37120g")
    elif(budget == 3):
        page = requests.get("https://pcpartpicker.com/product/btDzK8/kingston-a400-240gb-25-solid-state-drive-sa400s37240g")
    elif(budget == 4):
        page = requests.get("https://pcpartpicker.com/product/btDzK8/kingston-a400-240gb-25-solid-state-drive-sa400s37240g")
    elif(budget == 5):
        page = requests.get("https://pcpartpicker.com/product/jNdxFT/kingston-q500-480-gb-25-solid-state-drive-sq500s37480g")
    elif(budget == 6):
        page = requests.get("https://pcpartpicker.com/product/jNdxFT/kingston-q500-480-gb-25-solid-state-drive-sq500s37480g")
    elif(budget == 7):
        page = requests.get("https://pcpartpicker.com/product/jNdxFT/kingston-q500-480-gb-25-solid-state-drive-sq500s37480g")
    elif(budget == 8):
        page = requests.get("https://pcpartpicker.com/product/jNdxFT/kingston-q500-480-gb-25-solid-state-drive-sq500s37480g")
    elif(budget == 9):
        page = requests.get("https://pcpartpicker.com/product/w7PgXL/kingston-q500-960-gb-25-solid-state-drive-sq500s37960g")
    elif(budget == 10):
        page = requests.get("https://pcpartpicker.com/product/w7PgXL/kingston-q500-960-gb-25-solid-state-drive-sq500s37960g")

    bSoup(page, tag, budget, type)

def HDD(budget, type):
    tag = "HDD"
    if(budget == 1):
        page = requests.get("https://pcpartpicker.com/product/44Gj4D/seagate-barracuda-1tb-35-7200rpm-internal-hard-drive-st1000dm010")
    elif(budget == 2):
        page = requests.get("https://pcpartpicker.com/product/44Gj4D/seagate-barracuda-1tb-35-7200rpm-internal-hard-drive-st1000dm010")
    elif(budget == 3):
        page = requests.get("https://pcpartpicker.com/product/mwrYcf/seagate-barracuda-computer-2-tb-35-7200rpm-internal-hard-drive-st2000dm008")
    elif(budget == 4):
        page = requests.get("https://pcpartpicker.com/product/mwrYcf/seagate-barracuda-computer-2-tb-35-7200rpm-internal-hard-drive-st2000dm008")
    elif(budget == 5):
        page = requests.get("https://pcpartpicker.com/product/mwrYcf/seagate-barracuda-computer-2-tb-35-7200rpm-internal-hard-drive-st2000dm008")
    elif(budget == 6):
        page = requests.get("https://pcpartpicker.com/product/qRtWGX/seagate-barracuda-pro-4tb-35-7200rpm-internal-hard-drive-st4000dm006")
    elif(budget == 7):
        page = requests.get("https://pcpartpicker.com/product/qRtWGX/seagate-barracuda-pro-4tb-35-7200rpm-internal-hard-drive-st4000dm006")
    elif(budget == 8):
        page = requests.get("https://pcpartpicker.com/product/qRtWGX/seagate-barracuda-pro-4tb-35-7200rpm-internal-hard-drive-st4000dm006")
    elif(budget == 9):
        page = requests.get("https://pcpartpicker.com/product/dZ848d/seagate-ironwolf-pro-8-tb-35-7200rpm-internal-hard-drive-st8000ne0004")
    elif(budget == 10):
        page = requests.get("https://pcpartpicker.com/product/3cZFf7/seagate-ironwolf-pro-16-tb-35-7200rpm-internal-hard-drive-st16000ne000")
    bSoup(page, tag, budget, type)

def Gaming():
    budget = [1,2,3,4,5,6,7,8,9,10]
    type = "gaming"
    for i in budget:
        RAM_gaming(i, type)
        time.sleep(1)
        CPU_gaming(i, type)
        time.sleep(1)
        GraphicsCard(i, type)
        time.sleep(1)
        PowerSupply(i, type)
        time.sleep(1)
        Case(i, type)
        time.sleep(1)
        MotherBoard_gaming(i, type)
        time.sleep(1)
        SSD(i, type)
        time.sleep(1)
        HDD(i, type)
        time.sleep(5)

def Workstation():
    budget = [1,2,3,4,5,6,7,8,9,10]
    type = "workstation"
    for i in budget:
        RAM_workstation(i, type)
        time.sleep(1)
        CPU_workstation(i, type)
        time.sleep(1)
        GraphicsCard(i, type)
        time.sleep(1)
        PowerSupply(i, type)
        time.sleep(1)
        Case(i, type)
        time.sleep(1)
        MotherBoard_workstation(i, type)
        time.sleep(1)
        SSD(i, type)
        time.sleep(1)
        HDD(i, type)
        time.sleep(5)

def main():
    if((path.exists('data.csv')) == True):
        os.remove('data.csv')

    Gaming()
    Workstation()

main()
